.class public Lkevin/fun/hook/download/DownloadManager;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;,
        Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;,
        Lkevin/fun/hook/download/DownloadManager$ProgressCallback;,
        Lkevin/fun/hook/download/DownloadManager$ViewTags;
    }
.end annotation


# static fields
.field private static final DEFAULT_FILE_NAME_FORMAT:Ljava/lang/String;

.field private static final DOWNLOAD_EXECUTOR:Ljava/util/concurrent/ExecutorService;

.field private static final KEY_FILE_NAME_FORMAT:Ljava/lang/String;

.field private static final MAIN_HANDLER:Landroid/os/Handler;

.field private static final NOTIFICATION_CHANNEL_ID:Ljava/lang/String;

.field private static final NOTIFICATION_CHANNEL_NAME:Ljava/lang/String;

.field private static final NOTIFICATION_ID_DOWNLOAD:I = 0x2711

.field private static final OK_HTTP_CLIENT:Lokhttp3/OkHttpClient;

.field private static final TAG:Ljava/lang/String;

.field private static instance:Lkevin/fun/hook/download/DownloadManager;

.field private static notificationBuilder:Landroidx/core/app/NotificationCompat$Builder;

.field private static notificationManager:Landroid/app/NotificationManager;

.field private static final short:[S


# instance fields
.field private batchManager:Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

.field buffer:[B

.field private currentCommentAuthorAccount:Ljava/lang/String;

.field private currentCommentAuthorName:Ljava/lang/String;

.field private currentCommentAuthorUid:Ljava/lang/String;

.field private currentCommentCreateTime:J

.field private currentCommentId:Ljava/lang/String;

.field private currentCommentText:Ljava/lang/String;

.field private currentWorkAuthorAccount:Ljava/lang/String;

.field private currentWorkAuthorName:Ljava/lang/String;

.field private currentWorkAuthorUid:Ljava/lang/String;

.field private currentWorkCreateTime:J

.field private currentWorkVideoDesc:Ljava/lang/String;

.field private currentWorkVideoId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/4 v10, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    const/16 v0, 0x75f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/download/DownloadManager;->short:[S

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    sget v1, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v1, v1, 0x281

    const/16 v2, 0x767

    invoke-static {v0, v8, v1, v2}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/download/DownloadManager;->DEFAULT_FILE_NAME_FORMAT:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x12

    sget v2, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v2, v2, -0x25

    const/16 v3, 0x32d

    invoke-static {v0, v1, v2, v3}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/download/DownloadManager;->KEY_FILE_NAME_FORMAT:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x22

    sget v2, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v2, v2, -0x64

    const/16 v3, 0x39a

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/download/DownloadManager;->NOTIFICATION_CHANNEL_ID:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x38

    sget v2, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v2, v2, -0x3c7

    const/16 v3, 0xc2e

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/download/DownloadManager;->NOTIFICATION_CHANNEL_NAME:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x3d

    sget v2, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v2, v2, -0x4

    const/16 v3, 0x870

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/download/DownloadManager;->TAG:Ljava/lang/String;

    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۡۡۥۤ()Ljava/util/concurrent/TimeUnit;

    move-result-object v1

    const-wide/16 v2, 0xd

    sget v4, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    int-to-long v4, v4

    xor-long/2addr v2, v4

    invoke-static {v0, v2, v3, v1}, Lkevin/fun/hook/download/DownloadManager;->ۦۣۦ۟(Ljava/lang/Object;JLjava/lang/Object;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۡۡۥۤ()Ljava/util/concurrent/TimeUnit;

    move-result-object v1

    invoke-static {v0, v2, v3, v1}, Lkevin/fun/hook/download/DownloadManager;->ۦۡۦ۟(Ljava/lang/Object;JLjava/lang/Object;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۡۡۥۤ()Ljava/util/concurrent/TimeUnit;

    move-result-object v1

    invoke-static {v0, v2, v3, v1}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۨۥۣ(Ljava/lang/Object;JLjava/lang/Object;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-static {v0, v9}, Lkevin/fun/hook/download/DownloadManager;->ۣۢۥۡ(Ljava/lang/Object;Z)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget v1, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    int-to-long v2, v1

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۤۧ()Ljava/util/concurrent/TimeUnit;

    move-result-object v1

    sget v4, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v4, v4, -0x31

    new-instance v5, Lokhttp3/ConnectionPool;

    const-wide/16 v6, 0xc6

    xor-long/2addr v2, v6

    invoke-direct {v5, v4, v2, v3, v1}, Lokhttp3/ConnectionPool;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    invoke-static {v0, v5}, Lkevin/fun/hook/download/DownloadManager;->۟ۦۤۤ۠(Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Lokhttp3/Protocol;

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۣۤۡۥ()Lokhttp3/Protocol;

    move-result-object v2

    aput-object v2, v1, v8

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۣۡ()Lokhttp3/Protocol;

    move-result-object v2

    aput-object v2, v1, v9

    invoke-static {v1}, Landroidx/startup/ۤۧۥۣ;->ۡ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/download/DownloadManager;->۟ۨۧۤ(Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/download/DownloadManager;->ۣۡۨ(Ljava/lang/Object;)Lokhttp3/OkHttpClient;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/download/DownloadManager;->OK_HTTP_CLIENT:Lokhttp3/OkHttpClient;

    invoke-static {v4}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟۟ۥۥۧ(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/download/DownloadManager;->DOWNLOAD_EXECUTOR:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lkevin/fun/hook/download/DownloadManager;->MAIN_HANDLER:Landroid/os/Handler;

    sput-object v10, Lkevin/fun/hook/download/DownloadManager;->notificationManager:Landroid/app/NotificationManager;

    sput-object v10, Lkevin/fun/hook/download/DownloadManager;->notificationBuilder:Landroidx/core/app/NotificationCompat$Builder;

    return-void

    nop

    :array_0
    .array-data 2
        0x71cs
        0x724fs
        0x6550s
        0x536as
        0x71as
        0x738s
        0x71cs
        0x65f1s
        -0x6f6cs
        0x5490s
        0x71as
        0x738s
        0x71cs
        0x483bs
        0x53a6s
        0x72es
        0x723s
        0x71as
        0x34bs
        0x344s
        0x341s
        0x348s
        0x372s
        0x343s
        0x34cs
        0x340s
        0x348s
        0x372s
        0x34bs
        0x342s
        0x35fs
        0x340s
        0x34cs
        0x359s
        0x3f1s
        0x3ffs
        0x3ecs
        0x3f3s
        0x3f4s
        0x3c5s
        0x3fes
        0x3f5s
        0x3eds
        0x3f4s
        0x3f6s
        0x3f5s
        0x3fbs
        0x3fes
        0x3c5s
        0x3f9s
        0x3f2s
        0x3fbs
        0x3f4s
        0x3f4s
        0x3ffs
        0x3f6s
        0xc65s
        0xc4bs
        0xc58s
        0xc47s
        0xc40s
        0x3860s
        0x83bs
        0x815s
        0x806s
        0x819s
        0x81es
        0x85ds
        0x834s
        0x81fs
        0x807s
        0x81es
        0x81cs
        0x81fs
        0x811s
        0x814s
        0x3861s
        0x3587s
        0x5dcs
        0x5f2s
        0x5e1s
        0x5fes
        0x5f9s
        0x5bas
        0x5d3s
        0x5f8s
        0x5e0s
        0x5f9s
        0x5fbs
        0x5f8s
        0x5f6s
        0x5f3s
        0x3586s
        0x5b7s
        0x5641s
        0x681fs
        -0x6a73s
        0x7272s
        0x5ca6s
        -0x774es
        0x5ads
        0x5b7s
        0x66cas
        0x6fffs
        0x6179s
        0x5c2as
        -0x7347s
        0x52d0s
        0x6e6bs
        0x509es
        0x5c7fs
        0x6702s
        0x4c73s
        0x5bb4s
        -0x7060s
        0x7ff8s
        0x5643s
        0x6cf6s
        0x6c5es
        0x6b00s
        0x471bs
        0x5af9s
        0x588fs
        -0x7c0bs
        0x594as
        -0x7c44s
        0x776cs
        0x4609s
        -0x7881s
        0x7eecs
        0x5757s
        0x6857s
        0x541cs
        0x4d3fs
        -0x73b7s
        0xc79s
        0xc79s
        0xc79s
        0xc02s
        0xc17s
        -0x7c4as
        0x6fcds
        0x4245s
        0xc46s
        0xc46s
        0xc46s
        0x5c2ds
        0x5bd3s
        0x4628s
        -0x78a2s
        0x5986s
        0x67d8s
        0x445bs
        -0x7ad3s
        0x4c6s
        0x485s
        0x498s
        0x4dcs
        0x984s
        0x988s
        0x98as
        0x98as
        0x982s
        0x989s
        0x993s
        0x9b8s
        0x991s
        0x98es
        0x983s
        0x982s
        0x988s
        -0x7143s
        -0x713ds
        -0x7341s
        -0x6218s
        0xafds
        0xae2s
        0xaefs
        0xaees
        0xae4s
        0xaa4s
        0xae6s
        0xafbs
        0xabfs
        0x7b6s
        0x7f5s
        0x7e8s
        0x7acs
        0x8d7s
        0x8dbs
        0x8d9s
        0x8d9s
        0x8d1s
        0x8das
        0x8c0s
        0x8ebs
        0x8c2s
        0x8dds
        0x8d0s
        0x8d1s
        0x8dbs
        -0x7883s
        -0x78fds
        -0x7a81s
        -0x6bd8s
        0x542s
        0x55ds
        0x550s
        0x551s
        0x55bs
        0x51bs
        0x559s
        0x544s
        0x500s
        0xb64s
        0xb42s
        0xb54s
        0xb43s
        0xb1cs
        0xb70s
        0xb56s
        0xb54s
        0xb5fs
        0xb45s
        0x36es
        0x34cs
        0x359s
        0x34as
        0x34fs
        0x34fs
        0x342s
        0x30cs
        0x316s
        0x30ds
        0x313s
        0x303s
        0x30bs
        0x36fs
        0x34as
        0x34ds
        0x356s
        0x35bs
        0x318s
        0x303s
        0x362s
        0x34ds
        0x347s
        0x351s
        0x34cs
        0x34as
        0x347s
        0x303s
        0x312s
        0x313s
        0x30as
        0x303s
        0x362s
        0x353s
        0x353s
        0x34fs
        0x346s
        0x374s
        0x346s
        0x341s
        0x368s
        0x34as
        0x357s
        0x30cs
        0x316s
        0x310s
        0x314s
        0x30ds
        0x310s
        0x315s
        0x5308s
        0x5951s
        0x4896s
        0x49ffs
        0x7dbfs
        0x3cds
        0x3d1s
        0x3d1s
        0x3d5s
        -0x6964s
        -0x7796s
        0x7b84s
        0x3bfs
        0x3a5s
        0x3145s
        0x11es
        0x130s
        0x123s
        0x13cs
        0x13bs
        0x178s
        0x111s
        0x13as
        0x122s
        0x13bs
        0x139s
        0x13as
        0x134s
        0x131s
        0x3144s
        0x175s
        0x4f5es
        -0x71d8s
        0x5864s
        -0x7390s
        -0x1a7s
        0x7a79s
        0x61c1s
        -0x64d3s
        -0x7ecbs
        0xadas
        0xac0s
        0x47fcs
        -0x7976s
        -0x7ea4s
        0x47das
        0x6c5as
        0x4f73s
        -0x71fbs
        0x5849s
        -0x73a3s
        -0x18cs
        -0x7303s
        -0x7141s
        0x6678s
        0x585fs
        -0x6f4bs
        -0x7553s
        0x6a59s
        0x6408s
        0x449s
        0x46fs
        0x479s
        0x46es
        0x431s
        0x45ds
        0x47bs
        0x479s
        0x472s
        0x468s
        0x8dds
        0x8ffs
        0x8eas
        0x8f9s
        0x8fcs
        0x8fcs
        0x8f1s
        0x8bfs
        0x8a5s
        0x8bes
        0x8a0s
        0x5368s
        0x5931s
        0x48f6s
        0x499fs
        0x7ddfs
        0x11ds
        0x101s
        0x101s
        0x105s
        -0x6bb4s
        -0x7546s
        0x7954s
        0x16fs
        0x175s
        0xbc4s
        0xbe2s
        0xbf4s
        0xbe3s
        0xbbcs
        0xbd0s
        0xbf6s
        0xbf4s
        0xbffs
        0xbe5s
        0x421s
        0x403s
        0x416s
        0x405s
        0x400s
        0x400s
        0x40ds
        0x443s
        0x459s
        0x442s
        0x45cs
        0x44cs
        0x444s
        0x43bs
        0x405s
        0x402s
        0x408s
        0x403s
        0x41bs
        0x41fs
        0x44cs
        0x422s
        0x438s
        0x44cs
        0x45ds
        0x45cs
        0x442s
        0x45cs
        0x457s
        0x44cs
        0x43bs
        0x405s
        0x402s
        0x45as
        0x458s
        0x457s
        0x44cs
        0x414s
        0x45as
        0x458s
        0x445s
        0x44cs
        0x42ds
        0x41cs
        0x41cs
        0x400s
        0x409s
        0x43bs
        0x409s
        0x40es
        0x427s
        0x405s
        0x418s
        0x443s
        0x459s
        0x45fs
        0x45bs
        0x442s
        0x45fs
        0x45as
        0x2afs
        0x28ds
        0x28ds
        0x28bs
        0x29es
        0x29as
        0x5das
        0x5dfs
        0x5das
        0x24es
        0x26cs
        0x26cs
        0x26as
        0x27fs
        0x27bs
        0x222s
        0x243s
        0x26es
        0x261s
        0x268s
        0x27as
        0x26es
        0x268s
        0x26as
        0x13ds
        0x12fs
        0x16as
        0x104s
        0x109s
        0x16bs
        0x13ds
        0x12fs
        0x17cs
        0x136s
        0x17as
        0x177s
        0x169s
        0x17es
        0x6a7s
        0x694s
        0x69bs
        0x692s
        0x690s
        0xbe0s
        0xbfbs
        0xbf6s
        0xbe7s
        0xbf1s
        0xbbfs
        0xbb2s
        0xbafs
        0x620s
        0x60cs
        0x60ds
        0x60ds
        0x606s
        0x600s
        0x617s
        0x60as
        0x60cs
        0x60ds
        0x254s
        0x25as
        0x25as
        0x24fs
        0x212s
        0x25es
        0x253s
        0x256s
        0x249s
        0x25as
        0x44as
        0x461s
        0x479s
        0x460s
        0x462s
        0x461s
        0x46fs
        0x46as
        0x42es
        0x46ds
        0x46fs
        0x460s
        0x46ds
        0x46bs
        0x462s
        0x462s
        0x46bs
        0x46as
        0x6435s
        0x6d00s
        0x6386s
        0x5ed5s
        -0x71bas
        0x502fs
        0x6c94s
        0x713s
        0x724s
        0x732s
        0x731s
        0x72es
        0x72fs
        0x732s
        0x724s
        0x703s
        0x72es
        0x725s
        0x738s
        0x497bs
        0x7d3bs
        0xbf6s
        0xbeas
        0xbeas
        0xbees
        0xb9es
        0xa94s
        0xa85s
        0xa8ds
        0xa90s
        0xabfs
        0xa89s
        0xa8ds
        0xa81s
        0xa87s
        0xa85s
        0xa93s
        0x6ec4s
        0x67f1s
        0x593fs
        0x55des
        0x4510s
        0x6ed2s
        0x7dcas
        0x5471s
        0x82es
        0x83fs
        0x837s
        0x82as
        0x805s
        0x833s
        0x837s
        0x83bs
        0x83ds
        0x83fs
        0x805s
        0xc67s
        0xc23s
        0xc39s
        0xc2es
        0x85fs
        0x85as
        0x845s
        0x856s
        0x86cs
        0x843s
        0x85bs
        0x85cs
        0x847s
        0x85cs
        0x86cs
        0x857s
        0x85cs
        0x844s
        0x85ds
        0x85fs
        0x85cs
        0x852s
        0x857s
        0x86cs
        0x845s
        0x85as
        0x857s
        0x856s
        0x85cs
        0x64bs
        0x64es
        0x651s
        0x642s
        0x678s
        0x657s
        0x64fs
        0x648s
        0x653s
        0x648s
        0x678s
        0x643s
        0x648s
        0x650s
        0x649s
        0x64bs
        0x648s
        0x646s
        0x643s
        0x678s
        0x64es
        0x64as
        0x646s
        0x640s
        0x642s
        0x6df5s
        0x51bes
        0x489ds
        -0x7615s
        0x5d08s
        0x5723s
        0x5713s
        0x5d2fs
        0x93as
        0x93fs
        0x920s
        0x933s
        0x909s
        0x926s
        0x93es
        0x939s
        0x922s
        0x939s
        0x909s
        0xce7s
        0xca3s
        0xcb9s
        0xcaes
        0x3706s
        0x75ds
        0x773s
        0x760s
        0x77fs
        0x778s
        0x73bs
        0x752s
        0x779s
        0x761s
        0x778s
        0x77as
        0x779s
        0x777s
        0x772s
        0x3707s
        0x736s
        0x60f3s
        0x6568s
        -0x777bs
        0x56ecs
        0x6291s
        0x49e0s
        0x5e27s
        -0x75cds
        0x72cs
        0x736s
        0x295s
        0x2ads
        0x2e2s
        0x2ecs
        0x911s
        0x91es
        0xba2s
        0xbabs
        -0x7417s
        0x6792s
        0x4a1as
        0x97ds
        0x972s
        0x977s
        0x97es
        0x944s
        0x975s
        0x97as
        0x976s
        0x97es
        0x944s
        0x97ds
        0x974s
        0x969s
        0x976s
        0x97as
        0x96fs
        0x19es
        0x74cds
        0x63d2s
        0x55e8s
        0x198s
        0x1bas
        0x19es
        0x6373s
        -0x69eas
        0x5212s
        0x198s
        0x1bas
        0x19es
        0x4eb9s
        0x5524s
        0x1acs
        0x1a1s
        0x198s
        0x954s
        0x954s
        0x954s
        0x954s
        0x960s
        0x960s
        0x949s
        0x949s
        0x972s
        0x965s
        0x965s
        0x940s
        0x940s
        0x95es
        0x95es
        0x74cs
        0x493cs
        -0x77b6s
        0x62c1s
        -0x6d3ds
        0x74as
        0x563s
        0x56c9s
        0x5b1bs
        0x60ees
        -0x6f14s
        0x565s
        0xcf6s
        0x690as
        0x64c5s
        0xcf0s
        0xc75s
        0x4352s
        0x58cfs
        0xc47s
        0xc4as
        0xc73s
        0x5fds
        0x70aes
        0x67b1s
        0x5d3s
        0x5cfs
        0x5c2s
        0x5fbs
        0x63e9s
        0x7326s
        0x6655s
        -0x6cd0s
        0x5734s
        0xa61s
        0x688cs
        -0x6217s
        0x59eds
        0xa67s
        0x6079s
        0x70b6s
        0x727bs
        0x6564s
        0x32cs
        0x767fs
        0x6160s
        0x575as
        0x32as
        0x686s
        0x686s
        0x686s
        0xa54s
        0xa53s
        0xa53s
        0xa20s
        0xa35s
        0xa25s
        0xa30s
        0xa2ds
        0xa33s
        0xa31s
        0xa73s
        0xa52s
        0x21cs
        0x94fs
        0x941s
        0x952s
        0x94ds
        0x94as
        0x97bs
        0x901s
        0x957s
        0x97bs
        0x901s
        0x957s
        0x97bs
        0x901s
        0x957s
        0x58ds
        0x5ces
        0x5d3s
        0x590s
        0x860s
        0x839s
        0x82bs
        0x82cs
        0x83es
        0x40bs
        0x442s
        0x44cs
        0x443s
        0x4des
        0x480s
        0x49es
        0x497s
        0x3a8s
        0x3ecs
        0x3f6s
        0x3e1s
        0x656s
        0x615s
        0x608s
        0x64cs
        0x1c7s
        0x1das
        0x19es
        0x48fs
        0x490s
        0x49ds
        0x49cs
        0x496s
        0xc23s
        0xc39s
        0xc2cs
        0xc2es
        0x1a7s
        0x1bds
        0x1aas
        0xa8cs
        0xa92s
        0xa9bs
        0x1fds
        0x1f3s
        0x1fcs
        0x106s
        0x114s
        0x113s
        0x101s
        0x4eas
        0x4f7s
        0x4b4s
        0x542s
        0x556s
        0x547s
        0x54as
        0x54cs
        0x616s
        0x652s
        0x648s
        0x65ds
        0x65fs
        0x951s
        0x91ds
        0x916s
        0x911s
        0xbdcs
        0xbdfs
        0xbdes
        0xbd9s
        0xbd8s
        0xbdbs
        0xbdas
        0xbd5s
        0xbd4s
        0xbd7s
        0xbd6s
        0xbd1s
        0xbd0s
        0xbd3s
        0xbd2s
        0xbcds
        0xbccs
        0xbcfs
        0xbces
        0xbc9s
        0xbc8s
        0xbcbs
        0xbcas
        0xbc5s
        0xbc4s
        0xbc7s
        0xbads
        0xbacs
        0xbafs
        0xbaes
        0xba9s
        0xba8s
        0xbabs
        0xbaas
        0xba5s
        0xba4s
        0x4ees
        0x4ees
        0x4ees
        0x4ees
        0x4das
        0x4das
        0x4f3s
        0x4f3s
        0x4c8s
        0x4dfs
        0x4dfs
        0x4fas
        0x4fas
        0x4e4s
        0x4e4s
        0xb10s
        0xb11s
        0xb0as
        0xb17s
        0xb18s
        0xb17s
        0xb1ds
        0xb1fs
        0xb0as
        0xb17s
        0xb11s
        0xb10s
        0x4b1s
        0x4bfs
        0x4acs
        0x4b3s
        0x4b4s
        0x485s
        0x4bes
        0x4b5s
        0x4ads
        0x4b4s
        0x4b6s
        0x4b5s
        0x4bbs
        0x4bes
        0x485s
        0x4b9s
        0x4b2s
        0x4bbs
        0x4b4s
        0x4b4s
        0x4bfs
        0x4b6s
        0xbe5s
        0xbcbs
        0xbd8s
        0xbc7s
        0xbc0s
        0x4937s
        -0x77bfs
        -0x7719s
        0x599as
        -0x68das
        0x70d9s
        0x891s
        0x32as
        0x321s
        0x33es
        0x369s
        0x32fs
        0x342s
        0x34ds
        0x320s
        0x37cs
        0x8f2s
        0x8f9s
        0x8e6s
        0x8b1s
        0x8f7s
        0x89cs
        0x895s
        0x8f8s
        0x8a4s
        0xaf7s
        0xafcs
        0xae2s
        0xab4s
        0xaf2s
        0xa90s
        0xafds
        0xaa1s
        0x6b2s
        0x6b9s
        0x6a6s
        0x6f1s
        0x6das
        0x6d5s
        0x6b7s
        0x6b8s
        0x6b7s
        0x6b2s
        0x6b9s
        0x6a6s
        0x6f1s
        0x6das
        0x6d5s
        0x240s
        0x2d7s
        0x240s
        0x9a6s
        0x9a8s
        0x9bbs
        0x9a4s
        0x9a3s
        0x992s
        0x9a9s
        0x9a2s
        0x9bas
        0x9a3s
        0x9a1s
        0x9a2s
        0x9acs
        0x9a9s
        0x992s
        0x9aes
        0x9a5s
        0x9acs
        0x9a3s
        0x9a3s
        0x9a8s
        0x9a1s
        0x4cf8s
        -0x7272s
        0x597fs
        0x60e3s
        0x4a6ds
        -0x74e5s
        0x5d57s
        -0x76bds
        0x320fs
        0x254s
        0x27as
        0x269s
        0x276s
        0x271s
        0x232s
        0x25bs
        0x270s
        0x268s
        0x271s
        0x273s
        0x270s
        0x27es
        0x27bs
        0x320es
        0x23fs
        0x6421s
        0x7b25s
        0x5993s
        0x600fs
        -0x6dfbs
        0x75fas
        0x5b2es
        -0x70c6s
        0x225s
        0x23fs
        0x8abs
        0x8a5s
        0x8b6s
        0x8a9s
        0x8aes
        0x89fs
        0x8a4s
        0x8afs
        0x8b7s
        0x8aes
        0x8acs
        0x8afs
        0x8a1s
        0x8a4s
        0x89fs
        0x8a3s
        0x8a8s
        0x8a1s
        0x8aes
        0x8aes
        0x8a5s
        0x8acs
        0x6957s
        0x551cs
        0x4c3fs
        -0x72b7s
        0x489s
        0x48bs
        0x496s
        0x49es
        0x48bs
        0x49cs
        0x48as
        0x48as
        0xb2as
        0xb7cs
        0xb2fs
        0xb22s
        0xb2fs
        0xb2as
        0xb6bs
        0xb2as
        0xb2as
        0x99fs
        0x994s
        0x98bs
        0x9dcs
        0x9f7s
        0x9f8s
        0x99as
        0x995s
        0x99as
        0x99fs
        0x994s
        0x98bs
        0x9dcs
        0x9f7s
        0x9f8s
        0x341es
        0x445s
        0x46bs
        0x478s
        0x467s
        0x460s
        0x423s
        0x44as
        0x461s
        0x479s
        0x460s
        0x462s
        0x461s
        0x46fs
        0x46as
        0x341fs
        0x42es
        0x6230s
        0x7d34s
        -0x6becs
        0x73ebs
        0x5d3fs
        -0x76d5s
        0x434s
        0x42es
        0x722s
        0x766s
        0x768s
        0x77bs
        0x764s
        0x763s
        0x752s
        0x761s
        0x764s
        0x77bs
        0x768s
        0x752s
        0x779s
        0x768s
        0x760s
        0x77ds
        0x722s
        0x67f8s
        0x6ecds
        0x5003s
        0x5ce2s
        0x4c2cs
        0x67ees
        0x74f6s
        0x5d4ds
        0x222s
        0x238s
        0x181s
        0x190s
        0x198s
        0x185s
        0x1aas
        0x19cs
        0x198s
        0x194s
        0x192s
        0x190s
        0x1aas
        0xcdcs
        0x735s
        0x771s
        0x76bs
        0x77cs
        0xb84s
        0xb95s
        0xb9ds
        0xb80s
        0xbafs
        0xb86s
        0xb99s
        0xb94s
        0xb95s
        0xb9fs
        0xbafs
        0xaa2s
        0xae1s
        0xafcs
        0xab8s
        0x705s
        0x700s
        0x71fs
        0x70cs
        0x736s
        0x719s
        0x701s
        0x706s
        0x71ds
        0x706s
        0x736s
        0x559s
        0x55ds
        0x551s
        0x557s
        0x555s
        0x51fs
        0x55as
        0x540s
        0x555s
        0x557s
        0x53ees
        0x65f6s
        0x6261s
        0x4910s
        0x49ebs
        0x5cbes
        0x50ces
        0x7dcs
        0x7c6s
        -0x7442s
        -0x6517s
        0x4c73s
        -0x72fbs
        0x5b49s
        -0x70a3s
        0x242s
        0x258s
        0x509as
        0x7423s
        0x486fs
        -0x76e7s
        0x5f55s
        -0x74bfs
        0x65es
        0x644s
        0xb92s
        0xb88s
        0xb89s
        0xbads
        0xb9cs
        0xb89s
        0xb95s
        0xbc0s
        0xba6s
        0xa87s
        0xaa2s
        0xabds
        0xaaes
        0xa98s
        0xab2s
        0xaa5s
        0xabfs
        0xaa3s
        0xaaes
        0xab8s
        0xaa2s
        0xab8s
        0xa94s
        0xa88s
        0xa87s
        0xa8as
        0xa98s
        0xa98s
        0x764s
        0x761s
        0x772s
        0x761s
        0x772s
        0x66fs
        0x66as
        0x679s
        0x345cs
        0x407s
        0x429s
        0x43as
        0x425s
        0x422s
        0x461s
        0x408s
        0x423s
        0x43bs
        0x422s
        0x420s
        0x423s
        0x42ds
        0x428s
        0x345ds
        0x46cs
        0x4a82s
        0x46cs
        0x400s
        0x405s
        0x416s
        0x46cs
        -0x7805s
        0x579as
        -0x765ds
        0x5bc8s
        0x5d7ds
        -0x7697s
        0x476s
        0x46cs
        0x61as
        0x9c6s
        0x9c2s
        0x9ces
        0x9c8s
        0x9cas
        0x980s
        0x9c5s
        0x9dfs
        0x9cas
        0x9c8s
        0x6fd8s
        0x66eds
        -0x7671s
        0x59ees
        0x7f27s
        0x6828s
        0x7cbcs
        0x51a6s
        0x5b8ds
        0x5cc6s
        0x787fs
        -0x7829s
        0x55bcs
        -0xaccs
        0x442cs
        -0x7a55s
        0x5bc2s
        0x6fbfs
        0x44ces
        0x4435s
        0x5160s
        0x5d10s
        0x6ccds
        0x6999s
        0x59d7s
        0x5079s
        0x5a52s
        0x5d19s
        0x79a0s
        0x5fefs
        0x69f7s
        0x779cs
        0x6d9ds
        0x64a8s
        0x4676s
        -0x7900s
        -0x60dcs
        0x687cs
        0x5e83s
        0x7a3as
        0x5c42s
        0x5669s
        0x5122s
        0x759bs
        0x53d4s
        0x65ccs
        0x5eeds
        -0x7507s
        0x7e6s
        0x7fcs
        0x6294s
        0x5edfs
        0x6b8es
        -0x67c8s
        0x47fcs
        -0x7976s
        0x633fs
        0x5f74s
        0x6a25s
        -0x666ds
        0x4657s
        -0x78dfs
        0x7das
        0x799s
        0x784s
        0x7c7s
        0x1f2s
        0x1fes
        0x1fcs
        0x1fcs
        0x1f4s
        0x1ffs
        0x1e5s
        0x1ces
        0x1f0s
        0x1e4s
        0x1f5s
        0x1f8s
        0x1fes
        -0x7c98s
        -0x7ceas
        -0x7cbfs
        -0x60a1s
        0x90cs
        0x918s
        0x909s
        0x904s
        0x902s
        0x942s
        0x900s
        0x91ds
        0x959s
        0x1f7s
        0x1b3s
        0x1a9s
        0x1bes
        0x7efs
        0x7e3s
        0x7e1s
        0x7e1s
        0x7e9s
        0x7e2s
        0x7f8s
        0x7d3s
        0x7e5s
        0x7e1s
        0x7eds
        0x7ebs
        0x7e9s
        -0x7859s
        -0x7827s
        0x5a9ds
        0x7e24s
        0x9fcs
        0x9f8s
        0x9f4s
        0x9f2s
        0x9f0s
        0x9bas
        0x9ffs
        0x9e5s
        0x9f0s
        0x9f2s
        0x4f8s
        0x4bcs
        0x4a6s
        0x4b1s
        0xae6s
        0xaeas
        0xae8s
        0xae8s
        0xae0s
        0xaebs
        0xaf1s
        0xadas
        0xaecs
        0xae8s
        0xae4s
        0xae2s
        0xae0s
        -0x772cs
        -0x7756s
        0x55ees
        0x7157s
        0x6e4s
        0x6e0s
        0x6ecs
        0x6eas
        0x6e8s
        0x6a2s
        0x6e7s
        0x6fds
        0x6e8s
        0x6eas
        0xae5s
        0xaa1s
        0xabbs
        0xaacs
        0x9afs
        0x9aas
        0x9b5s
        0x9a6s
        0x99cs
        0x9b3s
        0x9abs
        0x9acs
        0x9b7s
        0x9acs
        0xc77s
        0xc7fs
        0xc7ds
        0xc78s
        0xc7bs
        0xa94s
        0xacds
        0xadfs
        0xad8s
        0xacas
        -0x73d5s
        0x6486s
        0x5746s
        0xac9s
        0xacds
        0xac1s
        0xac7s
        0xac5s
        0xa8fs
        0xad7s
        0xac5s
        0xac2s
        0xad0s
        0x460s
        0x424s
        0x43es
        0x429s
        0x980s
        0x98cs
        0x995s
        0x986s
        0x991s
        0x5b67s
        -0x6ffcs
        0xc17s
        0xc13s
        0xc1fs
        0xc19s
        0xc1bs
        0xc51s
        0xc14s
        0xc0es
        0xc1bs
        0xc19s
        0x284s
        0x2c0s
        0x2das
        0x2cds
        0x75ds
        0x759s
        0x755s
        0x753s
        0x751s
        0x5251s
        0x76e8s
        0x692s
        0x696s
        0x69as
        0x69cs
        0x69es
        0x6d4s
        0x691s
        0x68bs
        0x69es
        0x69cs
        0x341s
        0x305s
        0x31fs
        0x308s
        0x7afs
        0x7abs
        0x7a7s
        0x7a1s
        0x7a3s
        0x5ee2s
        0x7a5bs
        0x562s
        0x566s
        0x56as
        0x56cs
        0x56es
        0x524s
        0x561s
        0x57bs
        0x56es
        0x56cs
        0x7f2s
        0x7b6s
        0x7acs
        0x7bbs
        0x9fcs
        0x9f9s
        0x9e6s
        0x9f5s
        0x9cfs
        0x9e0s
        0x9f8s
        0x9ffs
        0x9e4s
        0x9ffs
        0x199s
        0x1das
        0x1c7s
        0x184s
        0x3e2s
        0x3fas
        0x3fcs
        0x3e6s
        0x3ecs
        -0x6ce1s
        0x4abcs
        0x8c0s
        0x8d4s
        0x8c5s
        0x8c8s
        0x8ces
        0x88es
        0x8ccs
        0x8d1s
        0x892s
        0x661s
        0x622s
        0x63fs
        0x67bs
        0x5b2s
        0x5ads
        0x5a0s
        0x5a1s
        0x5abs
        -0x77dcs
        -0x668ds
        0x305s
        0x31as
        0x317s
        0x316s
        0x31cs
        0x35cs
        0x31es
        0x303s
        0x347s
        0x231s
        0x272s
        0x26fs
        0x22bs
        0xaces
        0xad1s
        0xadcs
        0xadds
        0xad7s
        -0x7012s
        -0x6147s
        0x544s
        0x55bs
        0x556s
        0x557s
        0x55ds
        0x51ds
        0x55fs
        0x542s
        0x506s
        0x3a8as
        0xad1s
        0xaffs
        0xaecs
        0xaf3s
        0xaf4s
        0xab7s
        0xades
        0xaf5s
        0xaeds
        0xaf4s
        0xaf6s
        0xaf5s
        0xafbs
        0xafes
        0x3a8bs
        0xabas
        0x68e3s
        -0x64abs
        0x4491s
        -0x7a19s
        0x4461s
        0x583bs
        0x5598s
        0x54a2s
        0xaa0s
        0xabas
        -0x7020s
        -0x7062s
        0x5fbas
        0x5591s
        0x52das
        0x7663s
        0x4bf9s
        0x5f7cs
        0x6634s
        0x56bbs
        0x404s
        0x2337s
        0x4493s
        0x5f0es
        0x5051s
        0x5a7as
        0x5d31s
        0x7988s
        0x4412s
        0x5097s
        0x69dfs
        0x5950s
        0xbefs
        0x2cdcs
        0x3c72s
        0xc29s
        0xc07s
        0xc14s
        0xc0bs
        0xc0cs
        0xc4fs
        0xc26s
        0xc0ds
        0xc15s
        0xc0cs
        0xc0es
        0xc0ds
        0xc03s
        0xc06s
        0x3c73s
        0x4269s
        -0x7ce1s
        -0x7a5cs
        -0x6b0ds
        0x5553s
        -0x7eb9s
        0xc58s
        0xc42s
        0x3c79s
        0xc22s
        0xc0cs
        0xc1fs
        0xc00s
        0xc07s
        0xc44s
        0xc2ds
        0xc06s
        0xc1es
        0xc07s
        0xc05s
        0xc06s
        0xc08s
        0xc0ds
        0x3c78s
        0x4262s
        -0x7cecs
        -0x64d0s
        0x5a97s
        0x5558s
        -0x7eb4s
        0xc53s
        0xc49s
        -0x773fs
        -0x7741s
        0x589bs
        0x52b0s
        0x55fbs
        0x7142s
        0x4cd8s
        0x585ds
        0x6115s
        0x519as
        0x325s
        0x2416s
        0x467ds
        0x5de0s
        0x52bfs
        0x5894s
        0x5fdfs
        0x7b66s
        0x46fcs
        0x5279s
        0x6b31s
        0x5bbes
        0x901s
        0x2e32s
        0x5689s
        -0x7be9s
        0x4541s
        0x5f75s
        0x588bs
        0x4570s
        -0x7bfas
        -0xb89s
        -0x7b60s
        0x55dds
        0x577ds
        0x5c53s
        -0x649fs
        0x7c9es
        0x6374s
        0x6d45s
        0x7241s
        0x57e8s
        0x59ccs
        0x6792s
        0x4411s
        -0x7a99s
        0x794s
        0x7b6s
        0x7b9s
        0x7b4s
        0x7b2s
        0x7bbs
        0x7b2s
        0x7b3s
        0x4bds
        0x481s
        0x48ds
        0x485s
        0x48bs
        0x49as
        0x4ces
        0x48ds
        0x482s
        0x481s
        0x49ds
        0x48bs
        0x48as
        0x47f8s
        -0x7972s
        0x6be3s
        0x5b6cs
        0x9d3s
        0x2ee0s
        0x4422s
        -0x7aacs
        0x5318s
        -0x78f4s
        0xa13s
        0xa09s
        0x32bes
        0x2e5s
        0x2cbs
        0x2d8s
        0x2c7s
        0x2c0s
        0x283s
        0x2eas
        0x2c1s
        0x2d9s
        0x2c0s
        0x2c2s
        0x2c1s
        0x2cfs
        0x2cas
        0x32bfs
        0x4ca5s
        -0x722ds
        0x5930s
        0x531bs
        0x5450s
        0x5b9fs
        -0x7075s
        0x294s
        0x28es
    .end array-data
.end method

.method private constructor <init>()V
    .locals 4

    const-wide/16 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x40000

    new-array v0, v0, [B

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->buffer:[B

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkAuthorName:Ljava/lang/String;

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkAuthorAccount:Ljava/lang/String;

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkAuthorUid:Ljava/lang/String;

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkVideoId:Ljava/lang/String;

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkVideoDesc:Ljava/lang/String;

    iput-wide v2, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkCreateTime:J

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentAuthorName:Ljava/lang/String;

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentAuthorAccount:Ljava/lang/String;

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentAuthorUid:Ljava/lang/String;

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentId:Ljava/lang/String;

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentText:Ljava/lang/String;

    iput-wide v2, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentCreateTime:J

    new-instance v0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    invoke-direct {v0, p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;-><init>(Lkevin/fun/hook/download/DownloadManager;)V

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->batchManager:Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "AMHLi2vmDlYEvrvNayH1Ytfq"

    invoke-static {v0}, Landroidx/loader/ۢۥ۟;->۟ۦۡۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method static bridge synthetic _$$Nest$mdp(Lkevin/fun/hook/download/DownloadManager;Landroid/content/Context;F)I
    .locals 1

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v0

    return v0
.end method

.method static bridge synthetic _$$Nest$mshowDownloadProgressNotification(Lkevin/fun/hook/download/DownloadManager;Landroid/content/Context;Ljava/lang/String;IJJ)V
    .locals 0

    invoke-static/range {p0 .. p7}, Lkevin/fun/hook/download/DownloadManager;->۟۟۠ۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IJJ)V

    return-void
.end method

.method static bridge synthetic _$$Nest$mshowSuccessToast(Lkevin/fun/hook/download/DownloadManager;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/download/DownloadManager;->۟۠۟ۧۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static bridge synthetic _$$Nest$mupdateProgressUI(Lkevin/fun/hook/download/DownloadManager;Landroid/app/Dialog;[Landroid/widget/TextView;[Landroid/widget/ProgressBar;[Landroid/widget/TextView;IJJJ)V
    .locals 0

    invoke-static/range {p0 .. p11}, Lkevin/fun/hook/download/DownloadManager;->ۣ۟۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IJJJ)V

    return-void
.end method

.method static bridge synthetic _$$Nest$sfgetMAIN_HANDLER()Landroid/os/Handler;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۦۡۦۧ()Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method

.method private cancelDownloadNotification()V
    .locals 6

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۨ۠()Landroid/app/NotificationManager;

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
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۨ۠()Landroid/app/NotificationManager;

    move-result-object v0

    sget v1, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v1, v1, 0x2424

    invoke-static {v0, v1}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۥۣۤۨ(Ljava/lang/Object;I)V

    :sswitch_3
    const/4 v0, 0x0

    sput-object v0, Lkevin/fun/hook/download/DownloadManager;->notificationBuilder:Landroidx/core/app/NotificationCompat$Builder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    const/16 v0, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x4d

    sget v4, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v4, v4, -0x1b7

    const/16 v5, 0x597

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/download/DownloadManager;->ۡۨ۟(Ljava/lang/Object;)V

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

.method private copyFileToUri(Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    invoke-static {p1}, Landroidx/activity/ۣۦۡۥ;->۟ۢۢ(Ljava/lang/Object;)Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v0, p3}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣ۟ۤۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/io/OutputStream;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

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
    const/16 v0, 0x2000

    :try_start_2
    new-array v1, v0, [B

    :sswitch_3
    invoke-static {v3, v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟ۨۧ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v5

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    const/4 v0, -0x1

    if-ne v5, v0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {v4}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۢۨۥ(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

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
    :try_start_3
    invoke-static {v4}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡۦۣ(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    :sswitch_a
    :try_start_4
    invoke-static {v3}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۥ۟ۢ۟(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    return-void

    :sswitch_b
    const/4 v0, 0x0

    :try_start_5
    invoke-static {v4, v1, v0, v5}, Landroidx/activity/ۣۦۡۥ;->ۢۧ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;II)V

    const v0, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_c
    const v0, 0xbe9e

    goto :goto_3

    :catchall_0
    move-exception v0

    const v1, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :sswitch_d
    const v1, 0xc202

    :goto_5
    const v2, 0xc213

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_5

    goto :goto_5

    :sswitch_e
    if-eqz v4, :cond_3

    const v1, 0xc25f

    goto :goto_5

    :sswitch_f
    const v1, 0xbf1a

    goto :goto_4

    :sswitch_10
    new-instance v0, Ljava/lang/Exception;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x66

    sget v5, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v5, v5, 0x260

    const/16 v6, 0x32a

    invoke-static {v1, v2, v5, v6}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_3
    :sswitch_11
    const v1, 0xc240

    goto :goto_5

    :sswitch_12
    :try_start_6
    invoke-static {v4}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡۦۣ(Ljava/lang/Object;)V

    :sswitch_13
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v1

    move-object v2, v0

    :goto_6
    const v0, 0xc27e

    :goto_7
    const v4, 0xc28f

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_4
    :sswitch_14
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_15
    if-eqz v2, :cond_4

    const v0, 0xc2db

    goto :goto_7

    :sswitch_16
    const v0, 0xc2fa

    :goto_8
    const v4, 0xc30b

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_17
    if-eq v2, v1, :cond_5

    const v0, 0xc5e2

    goto :goto_8

    :cond_5
    :sswitch_18
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_19
    :try_start_7
    invoke-static {v2, v1}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc601

    :goto_9
    const v1, 0xc612

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_1a
    const v0, 0xc620

    goto :goto_9

    :sswitch_1b
    move-object v2, v1

    :sswitch_1c
    invoke-static {v3}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۥ۟ۢ۟(Ljava/lang/Object;)V

    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception v1

    move-object v0, v2

    :goto_a
    const v2, 0xc67d

    :goto_b
    const v3, 0xc68e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_9

    goto :goto_b

    :cond_6
    :sswitch_1d
    const v2, 0xc6bb

    goto :goto_b

    :sswitch_1e
    if-eqz v0, :cond_6

    const v2, 0xc965

    goto :goto_b

    :sswitch_1f
    const v2, 0xc984

    :goto_c
    const v3, 0xc995

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_a

    goto :goto_c

    :sswitch_20
    if-eq v0, v1, :cond_7

    const v2, 0xc9e1

    goto :goto_c

    :cond_7
    :sswitch_21
    const v2, 0xc9c2

    goto :goto_c

    :sswitch_22
    invoke-static {v0, v1}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xca00

    :goto_d
    const v2, 0xca11

    xor-int/2addr v1, v2

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_d

    :goto_e
    :pswitch_1
    :sswitch_23
    throw v0

    :pswitch_2
    const v1, 0xca1f

    goto :goto_d

    :sswitch_24
    move-object v0, v1

    goto :goto_e

    :catchall_3
    move-exception v1

    move-object v0, v2

    goto :goto_a

    :catchall_4
    move-exception v0

    move-object v1, v0

    goto/16 :goto_6

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_b
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_a
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_3
        0xef -> :sswitch_c
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
        0x4c -> :sswitch_12
        0x53 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_1b
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_18
        0x6c8 -> :sswitch_1c
        0x6e9 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1a
        0x32 -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1d
        0x35 -> :sswitch_24
        0xf3 -> :sswitch_1e
        0xfeb -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_20
        0x36 -> :sswitch_21
        0x57 -> :sswitch_23
        0x74 -> :sswitch_22
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method private createOutputUri(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, Lkevin/fun/hook/DownloadPathConfig;

    invoke-direct {v0, p1}, Lkevin/fun/hook/DownloadPathConfig;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۤۦۣۢ(Ljava/lang/Object;)Landroid/net/Uri;

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
    invoke-static {p1, v1}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۨۨۤۦ(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/documentfile/provider/DocumentFile;

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
    invoke-static {v1}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۦۤۥۤ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v2, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {v1, p3, p2}, Landroidx/startup/ۤۧۥۣ;->۟ۧ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/documentfile/provider/DocumentFile;

    move-result-object v1

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
    if-eqz v1, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {v1}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->۟۟ۧۧۦ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :sswitch_c
    new-instance v0, Ljava/lang/Exception;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x6d

    sget v3, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v3, v3, -0x64

    const/16 v4, 0x285

    invoke-static {v1, v2, v3, v4}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_d
    new-instance v0, Ljava/lang/Exception;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x73

    sget v3, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v3, v3, -0x3e

    const/16 v4, 0x916

    invoke-static {v1, v2, v3, v4}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_e
    new-instance v0, Ljava/lang/Exception;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x7b

    sget v3, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v3, v3, -0xe5

    const/16 v4, 0x802

    invoke-static {v1, v2, v3, v4}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_d
        0x1f4 -> :sswitch_5
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
.end method

.method private createProgressDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;
    .locals 10

    new-instance v1, Landroid/app/Dialog;

    const v0, 0x103034b

    sget v2, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/2addr v0, v2

    invoke-direct {v1, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 v0, 0x0

    invoke-static {v1, v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۡۡ۠(Ljava/lang/Object;Z)V

    new-instance v2, Landroid/widget/FrameLayout;

    invoke-direct {v2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sget v0, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v0, v0, -0x20f

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {v2, v3}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v3, 0x660001ea

    sget v4, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/2addr v3, v4

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۣۢۧ(Ljava/lang/Object;I)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x1

    invoke-static {v3, v4}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v4, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v4, v4, -0x17c

    invoke-static {v3, v4}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    const/high16 v5, 0x41c00000    # 24.0f

    invoke-static {p0, p1, v5}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v5

    const/high16 v6, 0x41c00000    # 24.0f

    invoke-static {p0, p1, v6}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x41c00000    # 24.0f

    invoke-static {p0, p1, v7}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v7

    const/high16 v8, 0x41c00000    # 24.0f

    invoke-static {p0, p1, v8}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v8

    invoke-static {v3, v5, v6, v7, v8}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    const/high16 v6, 0x43960000    # 300.0f

    invoke-static {p0, p1, v6}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v6

    sget v7, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v7, v7, 0x4b

    invoke-direct {v5, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    iput v4, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {v3, v5}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {p0, p1, v0}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v0

    int-to-float v0, v0

    invoke-static {v5, v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v3, v5}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x83

    sget v8, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v8, v8, 0xf7

    const/16 v9, 0x334

    invoke-static {v6, v7, v8, v9}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, p2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v5, 0x41800000    # 16.0f

    invoke-static {v0, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v5

    invoke-static {v0, v5}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    const v5, -0xcccec3

    sget v6, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/2addr v5, v6

    invoke-static {v0, v5}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v0, v4}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, 0x41400000    # 12.0f

    invoke-static {p0, p1, v8}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v8

    invoke-static {v0, v5, v6, v7, v8}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v3, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {p3}, Landroidx/emoji2/ۢۧۡۧ;->ۤۥۨۢ(Ljava/lang/Object;)I

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
    const/16 v0, 0x1e

    if-le v6, v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x0

    sget v6, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v6, v6, 0x52

    invoke-static {p3, v0, v6}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۦ۠ۡ۠(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x87

    sget v8, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v8, v8, -0x1c8

    const/16 v9, 0xc57

    invoke-static {v6, v7, v8, v9}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {v5, p3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41400000    # 12.0f

    invoke-static {v5, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v0, 0x9999ac

    sget v6, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/2addr v0, v6

    invoke-static {v5, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v5, v4}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/high16 v7, 0x41800000    # 16.0f

    invoke-static {p0, p1, v7}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v7

    invoke-static {v5, v0, v4, v6, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v3, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/ProgressBar;

    const/4 v4, 0x0

    const v5, -0x10103bf

    sget v6, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/2addr v5, v6

    invoke-direct {v0, p1, v4, v5}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 v4, 0x40800000    # 4.0f

    invoke-static {p0, p1, v4}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v4

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    sget v6, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v6, v6, 0x322

    invoke-direct {v5, v6, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v5}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۦۤ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v4, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v4, v4, 0x37b

    invoke-static {v0, v4}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۥۨ۟(Ljava/lang/Object;I)V

    invoke-static {v3, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x8a

    sget v6, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v6, v6, -0x1e6

    const/16 v7, 0xc32

    invoke-static {v4, v5, v6, v7}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v4, 0x41400000    # 12.0f

    invoke-static {v0, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v4, 0xa89d

    sget v5, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/2addr v4, v5

    invoke-static {v0, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v4

    invoke-static {v0, v4}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v4, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v4, v4, 0x2

    invoke-static {v0, v4}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v4, 0x0

    const/high16 v5, 0x41000000    # 8.0f

    invoke-static {p0, p1, v5}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v0, v4, v5, v6, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v3, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x8c

    sget v6, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v6, v6, 0x324

    const/16 v7, 0xc68

    invoke-static {v4, v5, v6, v7}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v4, 0x41300000    # 11.0f

    invoke-static {v0, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v4, -0x6666a6

    sget v5, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/2addr v4, v5

    invoke-static {v0, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    sget v4, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v4, v4, 0x11d

    invoke-static {v0, v4}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    invoke-static {v3, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x0

    invoke-static {v0, v4}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const/4 v4, 0x0

    const/high16 v5, 0x41800000    # 16.0f

    invoke-static {p0, p1, v5}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v0, v4, v5, v6, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    sget v4, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v4, v4, -0x80

    invoke-static {v0, v4}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v5

    const/16 v6, 0x92

    sget v7, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v7, v7, 0xf7

    const/16 v8, 0x823

    invoke-static {v5, v6, v7, v8}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v5, 0x41600000    # 14.0f

    invoke-static {v4, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v5, 0x9999ec

    sget v6, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/2addr v5, v6

    invoke-static {v4, v5}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    sget v5, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v5, v5, -0x26

    invoke-static {v4, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/high16 v5, 0x41800000    # 16.0f

    invoke-static {p0, p1, v5}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v5

    const/high16 v6, 0x41400000    # 12.0f

    invoke-static {p0, p1, v6}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x41800000    # 16.0f

    invoke-static {p0, p1, v7}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v7

    const/high16 v8, 0x41400000    # 12.0f

    invoke-static {p0, p1, v8}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v8

    invoke-static {v4, v5, v6, v7, v8}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x0

    sget v7, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v7, v7, 0x21e

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct {v5, v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v6, -0xa0b74

    sget v7, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/2addr v6, v7

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const/high16 v6, 0x41c80000    # 25.0f

    invoke-static {p0, p1, v6}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v6

    int-to-float v6, v6

    invoke-static {v5, v6}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v4, v5}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x96

    sget v8, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v8, v8, 0x108

    const/16 v9, 0xa50

    invoke-static {v6, v7, v8, v9}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v6, 0x41600000    # 14.0f

    invoke-static {v5, v6}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v6, 0xab6e

    sget v7, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/2addr v6, v7

    invoke-static {v5, v6}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v6, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v6, v6, -0x249

    invoke-static {v5, v6}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/high16 v6, 0x41800000    # 16.0f

    invoke-static {p0, p1, v6}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x41400000    # 12.0f

    invoke-static {p0, p1, v7}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v7

    const/high16 v8, 0x41800000    # 16.0f

    invoke-static {p0, p1, v8}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v8

    const/high16 v9, 0x41400000    # 12.0f

    invoke-static {p0, p1, v9}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v9

    invoke-static {v5, v6, v7, v8, v9}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, 0x0

    sget v8, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v8, v8, 0x109

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct {v6, v7, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v7, -0xa0b56

    sget v8, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/2addr v7, v8

    invoke-static {v6, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const/high16 v7, 0x41c80000    # 25.0f

    invoke-static {p0, p1, v7}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v7

    int-to-float v7, v7

    invoke-static {v6, v7}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v5, v6}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Landroid/view/View;

    invoke-direct {v6, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {p0, p1, v8}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v8

    sget v9, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v9, v9, -0x1c0

    invoke-direct {v7, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v6, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v7, -0x111320

    sget v8, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/2addr v7, v8

    invoke-static {v6, v7}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    invoke-static {v0, v4}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v6}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۤۢ۠ۤ()I

    move-result v0

    invoke-static {v2, v0, v4}, Landroidx/loader/ۥۧۨۤ;->۟ۥۧۢۤ(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۣۤ۠ۦ()I

    move-result v0

    invoke-static {v2, v0, v5}, Landroidx/loader/ۥۧۨۤ;->۟ۥۧۢۤ(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {v1}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨۥۢ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v2

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-eqz v2, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    invoke-static {v1}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨۥۢ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۦۢ۟(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۤۢ۠ۤ()I

    move-result v2

    invoke-static {v0, v2, v4}, Landroidx/loader/ۣۦ۟ۡ;->ۥۣۥۨ(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {v1}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨۥۢ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۦۢ۟(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۣۤ۠ۦ()I

    move-result v2

    invoke-static {v0, v2, v5}, Landroidx/loader/ۣۦ۟ۡ;->ۥۣۥۨ(Ljava/lang/Object;ILjava/lang/Object;)V

    :sswitch_8
    const v0, 0x3f666666    # 0.9f

    invoke-static {v3, v0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۡۦ۟ۦ(Ljava/lang/Object;F)V

    const v0, 0x3f666666    # 0.9f

    invoke-static {v3, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣ۟ۡۢ(Ljava/lang/Object;F)V

    const/4 v0, 0x0

    invoke-static {v3, v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۡۦۦۧ(Ljava/lang/Object;F)V

    invoke-static {v3}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۣۤۤ(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

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

    const-wide/16 v2, 0x3d7

    sget v4, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    int-to-long v4, v4

    xor-long/2addr v2, v4

    invoke-static {v0, v2, v3}, Landroidx/loader/ۥۧۨۤ;->ۣۣۧ۠(Ljava/lang/Object;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v2, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v2}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    invoke-static {v0, v2}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۦ۟ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤ۟ۥ(Ljava/lang/Object;)V

    return-object v1

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

.method private deletePartialFile(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 3

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    :try_start_0
    invoke-static {p1, p2}, Landroidx/customview/ۤۡۥ;->ۤ۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/documentfile/provider/DocumentFile;

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
    invoke-static {v1}, Landroidx/lifecycle/process/۠ۢۧۡ;->۟۠۠ۡۢ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v2, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۡۢۦ(Ljava/lang/Object;)Z

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
    invoke-static {p1}, Landroidx/activity/ۣۦۡۥ;->۟ۢۢ(Ljava/lang/Object;)Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, p2, v1, v2}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۣۢۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v0, 0xbefb

    :goto_5
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :sswitch_c
    const v0, 0xbf1a

    goto :goto_5

    :catchall_0
    move-exception v0

    goto :goto_4

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

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_9
        0x1f7 -> :sswitch_c
    .end sparse-switch
.end method

.method private downloadCommentVideo(Landroid/content/Context;Ljava/lang/String;)V
    .locals 11

    const/4 v7, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e1\u06e2"

    move-object v4, v0

    move-object v3, v0

    move-object v6, v0

    move-object v5, v0

    move-object v8, v0

    move v9, v2

    move v10, v2

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    xor-int/lit16 v2, v9, 0x352

    const-string v0, "\u06e3\u06e6\u06e6"

    move-object v1, v0

    move v10, v2

    goto :goto_0

    :sswitch_0
    xor-int/lit8 v2, v9, 0x17

    const-string v0, "\u06df\u06e6\u06e6"

    move-object v1, v0

    move v10, v2

    goto :goto_0

    :sswitch_1
    const/16 v0, 0x9a

    const/16 v1, 0x4e8

    invoke-static {v8, v0, v10, v1}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v6

    const-string v0, "\u06e8\u06e5\u06e7"

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->۟ۥ۠ۧۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    const-string v0, "\u06e3\u06e1\u06e1"

    move-object v1, v0

    goto :goto_0

    :sswitch_3
    sget v2, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    const-string v0, "\u06e0\u06e5\u06e3"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_4
    sget v2, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    const-string v0, "\u06df\u06e0\u06e5"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e1\u06e8"

    move-object v8, v0

    goto :goto_0

    :sswitch_6
    const/16 v0, 0x9e

    const/16 v1, 0x9e7

    invoke-static {v8, v0, v10, v1}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06df\u06e1\u06e6"

    move-object v1, v0

    goto :goto_0

    :sswitch_7
    sget v2, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    const-string v0, "\u06e5\u06e5"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_8
    xor-int/lit16 v2, v9, 0x31b

    const-string v0, "\u06e5\u06df\u06df"

    move-object v1, v0

    move v10, v2

    goto :goto_0

    :sswitch_9
    const/16 v0, 0xaf

    const/16 v1, 0xa8b

    invoke-static {v8, v0, v10, v1}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v3

    const-string v0, "\u06e1\u06e7\u06e2"

    move-object v1, v0

    goto :goto_0

    :sswitch_a
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06df\u06e6\u06e4"

    move-object v8, v0

    goto :goto_0

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e3\u06e2\u06e7"

    move-object v8, v0

    goto :goto_0

    :sswitch_c
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e0\u06df\u06e6"

    move-object v8, v0

    goto :goto_0

    :sswitch_d
    sget v2, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    const-string v0, "\u06e0\u06e3\u06e6"

    move-object v1, v0

    move v9, v2

    goto/16 :goto_0

    :sswitch_e
    xor-int/lit16 v2, v9, -0x119

    const-string v0, "\u06e4\u06e4\u06e8"

    move-object v1, v0

    move v10, v2

    goto/16 :goto_0

    :sswitch_f
    invoke-static {p0, v5, v7, v6}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "\u06e5\u06e2\u06e1"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۦۨ۠ۦ()Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06e5\u06e5\u06e7"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_11
    const/16 v0, 0xab

    const/16 v1, 0x579

    invoke-static {v8, v0, v10, v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v6

    const-string v0, "\u06e0\u06df\u06e0"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_12
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc27 -> :sswitch_4
        0x1aa724 -> :sswitch_e
        0x1aa740 -> :sswitch_a
        0x1aa744 -> :sswitch_f
        0x1aa7dd -> :sswitch_3
        0x1aa7df -> :sswitch_1
        0x1aaac1 -> :sswitch_b
        0x1aaac7 -> :sswitch_d
        0x1aab43 -> :sswitch_8
        0x1aab7e -> :sswitch_0
        0x1aaf7c -> :sswitch_2
        0x1ab643 -> :sswitch_12
        0x1ab668 -> :sswitch_7
        0x1ab6e3 -> :sswitch_9
        0x1aba68 -> :sswitch_6
        0x1abd85 -> :sswitch_11
        0x1abde4 -> :sswitch_10
        0x1abe47 -> :sswitch_c
        0x1ac98a -> :sswitch_5
    .end sparse-switch
.end method

.method private downloadCommentVideoSilent(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0xb8

    sget v2, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v2, v2, 0x3a4

    const/16 v3, 0x798

    invoke-static {v0, v1, v2, v3}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0xbc

    sget v3, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v3, v3, 0x312

    const/16 v4, 0x8b4

    invoke-static {v1, v2, v3, v4}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {p0, v1, v2, v0}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۦۨ۠ۦ()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0xc9

    sget v2, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v2, v2, -0x4f

    const/16 v3, 0xcb9

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0xcd

    sget v2, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v2, v2, 0xfa

    const/16 v3, 0x534

    invoke-static {v0, v1, v2, v3}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->۟ۥ۠ۧۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "fbSQKRzVHnX2vR9k"

    invoke-static {v0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟ۢۥ۟(Ljava/lang/String;)Ljava/lang/String;

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

.method private downloadFile(Ljava/lang/String;Ljava/io/File;)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v10, 0x3

    const/4 v4, 0x0

    const/4 v0, 0x1

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
    if-gt v0, v10, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_3
    :try_start_0
    new-instance v1, Lokhttp3/Request$Builder;

    invoke-direct {v1}, Lokhttp3/Request$Builder;-><init>()V

    invoke-static {v1, p1}, Lkevin/fun/hook/download/DownloadManager;->ۣ۟ۧ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Request$Builder;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0xd6

    sget v5, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v5, v5, -0x254

    const/16 v6, 0xb31

    invoke-static {v2, v3, v5, v6}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v3

    const/16 v5, 0xe0

    sget v6, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v6, v6, 0x16d

    const/16 v7, 0x323

    invoke-static {v3, v5, v6, v7}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lkevin/fun/hook/download/DownloadManager;->ۡۧ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Request$Builder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/download/DownloadManager;->ۤۡ۟ۢ(Ljava/lang/Object;)Lokhttp3/Request;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۤ۟ۢ()Lokhttp3/OkHttpClient;

    move-result-object v2

    invoke-static {v2, v1}, Lkevin/fun/hook/download/DownloadManager;->ۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Call;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/download/DownloadManager;->۟ۨۡۧ(Ljava/lang/Object;)Lokhttp3/Response;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    move-result-object v5

    :try_start_1
    invoke-static {v5}, Lkevin/fun/hook/download/DownloadManager;->ۣۤۡۡ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v2, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {v5}, Lkevin/fun/hook/download/DownloadManager;->ۦۡۢ۠(Ljava/lang/Object;)Lokhttp3/ResponseBody;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-result-object v2

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-eqz v2, :cond_2

    const v1, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v1, 0xbe41

    goto :goto_2

    :sswitch_9
    :try_start_2
    new-instance v6, Ljava/io/BufferedInputStream;

    invoke-static {v2}, Lkevin/fun/hook/download/DownloadManager;->ۣۧۦ(Ljava/lang/Object;)Ljava/io/InputStream;

    move-result-object v1

    const v2, 0x8382

    sget v3, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/2addr v2, v3

    invoke-direct {v6, v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    :try_start_3
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    :try_start_4
    new-array v2, v2, [B

    :sswitch_a
    invoke-static {v6, v2}, Landroidx/loader/ۥۧۨۤ;->ۦۥ۠۠(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v7

    const v1, 0xbe7f

    :goto_3
    const v8, 0xbe90

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_b
    const v1, 0xbebd

    goto :goto_3

    :sswitch_c
    const/4 v1, -0x1

    if-ne v7, v1, :cond_3

    const v1, 0xbedc

    goto :goto_3

    :sswitch_d
    invoke-static {v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۦۢۡۢ(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-static {v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    :try_start_6
    invoke-static {v6}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    const v0, 0xbefb

    :goto_4
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_e
    const v0, 0xbf39

    goto :goto_4

    :sswitch_f
    if-eqz v5, :cond_4

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_10
    invoke-static {v5}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۧۧۡ(Ljava/lang/Object;)V

    :sswitch_11
    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۢۤۦ()I

    move-result v1

    const v0, 0xc202

    :goto_5
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_12
    if-gtz v1, :cond_5

    const v0, 0xc25f

    goto :goto_5

    :cond_5
    :sswitch_13
    const v0, 0xc240

    goto :goto_5

    :sswitch_14
    const-string v0, "pgdl9CHbYKnrT"

    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۣۢ۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_15
    return-void

    :sswitch_16
    const/4 v1, 0x0

    :try_start_7
    invoke-static {v3, v2, v1, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠ۦۤۧ(Ljava/lang/Object;Ljava/lang/Object;II)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const v1, 0xc27e

    :goto_6
    const v7, 0xc28f

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_6

    goto :goto_6

    :sswitch_17
    const v1, 0xc29d

    goto :goto_6

    :catchall_0
    move-exception v1

    :try_start_8
    invoke-static {v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V

    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :catchall_1
    move-exception v2

    move-object v3, v1

    :goto_7
    const v1, 0xc2fa

    :goto_8
    const v7, 0xc30b

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :sswitch_18
    if-eqz v3, :cond_6

    const v1, 0xc5e2

    goto :goto_8

    :cond_6
    :sswitch_19
    const v1, 0xc5c3

    goto :goto_8

    :sswitch_1a
    const v1, 0xc601

    :goto_9
    const v7, 0xc612

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_8

    goto :goto_9

    :sswitch_1b
    if-eq v3, v2, :cond_7

    const v1, 0xc65e

    goto :goto_9

    :cond_7
    :sswitch_1c
    const v1, 0xc63f

    goto :goto_9

    :sswitch_1d
    :try_start_9
    invoke-static {v3, v2}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xc67d

    :goto_a
    const v2, 0xc68e

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_9

    goto :goto_a

    :goto_b
    :sswitch_1e
    invoke-static {v6}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V

    throw v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception v1

    :goto_c
    const v2, 0xc984

    :goto_d
    const v6, 0xc995

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_a

    goto :goto_d

    :sswitch_1f
    if-eqz v3, :cond_8

    const v2, 0xc9e1

    goto :goto_d

    :sswitch_20
    const v1, 0xc69c

    goto :goto_a

    :sswitch_21
    move-object v3, v2

    goto :goto_b

    :cond_8
    :sswitch_22
    const v2, 0xc9c2

    goto :goto_d

    :sswitch_23
    const v2, 0xca00

    :goto_e
    const v6, 0xca11

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_b

    goto :goto_e

    :cond_9
    :sswitch_24
    const v2, 0xca3e

    goto :goto_e

    :sswitch_25
    if-eq v3, v1, :cond_9

    const v2, 0xca5d

    goto :goto_e

    :sswitch_26
    :try_start_a
    invoke-static {v3, v1}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xca7c

    :goto_f
    const v2, 0xca8d

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_c

    goto :goto_f

    :sswitch_27
    const v1, 0xcd26

    goto :goto_f

    :sswitch_28
    move-object v3, v1

    :sswitch_29
    throw v3
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :catch_0
    move-exception v2

    move-object v1, v5

    :goto_10
    :try_start_b
    invoke-static {p2}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    move-result v5

    const v3, 0xcdff

    :goto_11
    const v6, 0xce10

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_d

    goto :goto_11

    :cond_a
    :sswitch_2a
    const v3, 0xce3d

    goto :goto_11

    :sswitch_2b
    :try_start_c
    new-instance v1, Ljava/io/IOException;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x112

    sget v6, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v6, v6, 0x15a

    const/16 v7, 0x7c5

    invoke-static {v2, v3, v6, v7}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_3
    move-exception v0

    move-object v4, v5

    :goto_12
    const v1, 0xcd83

    :goto_13
    const v2, 0xcd94

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_e

    goto :goto_13

    :sswitch_2c
    const v1, 0xcda2

    goto :goto_13

    :sswitch_2d
    new-instance v1, Ljava/io/IOException;

    invoke-static {v5}, Lkevin/fun/hook/download/DownloadManager;->ۣۣ۟ۡ۟(Ljava/lang/Object;)I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x117

    sget v8, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v8, v8, 0x33c

    const/16 v9, 0x385

    invoke-static {v6, v7, v8, v9}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v2}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :sswitch_2e
    if-eqz v5, :cond_a

    const v3, 0xd0e7

    goto :goto_11

    :sswitch_2f
    :try_start_d
    invoke-static {p2}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣ۟ۢۤ(Ljava/lang/Object;)Z

    :sswitch_30
    invoke-static {v2}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟۟ۦۨۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x120

    sget v8, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v8, v8, 0x34c

    const/16 v9, 0x155

    invoke-static {v6, v7, v8, v9}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x137

    sget v8, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v8, v8, -0x1ab

    const/16 v9, 0xae0

    invoke-static {v6, v7, v8, v9}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/download/DownloadManager;->ۡۨ۟(Ljava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    const v3, 0xd106

    :goto_14
    const v5, 0xd117

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_f

    goto :goto_14

    :sswitch_31
    if-eq v0, v10, :cond_b

    const v3, 0xd163

    goto :goto_14

    :cond_b
    :sswitch_32
    const v3, 0xd144

    goto :goto_14

    :sswitch_33
    int-to-long v2, v0

    const-wide/16 v6, 0x3e8

    mul-long/2addr v2, v6

    :try_start_e
    invoke-static {v2, v3}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۡۥۨ(J)V
    :try_end_e
    .catch Ljava/lang/InterruptedException; {:try_start_e .. :try_end_e} :catch_1
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    const v2, 0xd182

    :goto_15
    const v3, 0xd193

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_10

    goto :goto_15

    :sswitch_34
    if-eqz v1, :cond_c

    const v2, 0xd1df

    goto :goto_15

    :cond_c
    :sswitch_35
    const v2, 0xd1c0

    goto :goto_15

    :sswitch_36
    invoke-static {v1}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۧۧۡ(Ljava/lang/Object;)V

    :sswitch_37
    sget v1, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v1, v1, 0x2ff

    add-int/2addr v0, v1

    const v1, 0xd1fe

    :goto_16
    const v2, 0xd20f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_11

    goto :goto_16

    :sswitch_38
    const v1, 0xd4a8

    goto :goto_16

    :catch_1
    move-exception v0

    :try_start_f
    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۦۢۤۡ()Ljava/lang/Thread;

    move-result-object v2

    invoke-static {v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۠۠۟ۦ(Ljava/lang/Object;)V

    new-instance v2, Ljava/io/IOException;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v3

    const/16 v4, 0x13c

    sget v5, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v5, v5, 0x22b

    const/16 v6, 0x9f7

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catchall_4
    move-exception v0

    move-object v4, v1

    goto/16 :goto_12

    :sswitch_39
    throw v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    :sswitch_3a
    const v1, 0xd505

    :goto_17
    const v2, 0xd516

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_12

    goto :goto_17

    :sswitch_3b
    if-eqz v4, :cond_d

    const v1, 0xd562

    goto :goto_17

    :cond_d
    :sswitch_3c
    const v1, 0xd543

    goto :goto_17

    :sswitch_3d
    invoke-static {v4}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۧۧۡ(Ljava/lang/Object;)V

    :sswitch_3e
    throw v0

    :sswitch_3f
    new-instance v0, Ljava/io/IOException;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x141

    sget v3, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v3, v3, 0x1e

    const/16 v4, 0x178

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_2
    move-exception v2

    move-object v1, v4

    goto/16 :goto_10

    :catchall_5
    move-exception v0

    goto/16 :goto_12

    :catchall_6
    move-exception v1

    move-object v3, v4

    goto/16 :goto_c

    :catchall_7
    move-exception v1

    move-object v2, v1

    move-object v3, v4

    goto/16 :goto_7

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_2d
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_2b
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_16
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
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
        0x12 -> :sswitch_a
        0xf1 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_18
        0x6af -> :sswitch_19
        0x6c8 -> :sswitch_21
        0x6e9 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1b
        0x2d -> :sswitch_1e
        0x32 -> :sswitch_1c
        0x4c -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1e
        0xf3 -> :sswitch_20
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_22
        0x57 -> :sswitch_28
        0x74 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_24
        0x11 -> :sswitch_25
        0x2f -> :sswitch_29
        0x4c -> :sswitch_26
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_27
        0x7ab -> :sswitch_29
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_2a
        0x2d -> :sswitch_30
        0x3ef -> :sswitch_2e
        0x1ef7 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x17 -> :sswitch_2c
        0x36 -> :sswitch_3a
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_31
        0x32 -> :sswitch_32
        0x53 -> :sswitch_39
        0x74 -> :sswitch_33
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_34
        0x32 -> :sswitch_35
        0x4c -> :sswitch_36
        0x53 -> :sswitch_37
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_38
        0x6a7 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_3b
        0x32 -> :sswitch_3c
        0x55 -> :sswitch_3e
        0x74 -> :sswitch_3d
    .end sparse-switch
.end method

.method private downloadFileSync(Ljava/lang/String;Ljava/io/File;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v3, 0x0

    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    invoke-static {v0, p1}, Lkevin/fun/hook/download/DownloadManager;->ۣ۟ۧ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x14e

    sget v4, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v4, v4, 0xc9

    const/16 v5, 0x41c

    invoke-static {v1, v2, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v4, 0x158

    sget v5, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v5, v5, 0x16d

    const/16 v6, 0x890

    invoke-static {v2, v4, v5, v6}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lkevin/fun/hook/download/DownloadManager;->ۡۧ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/download/DownloadManager;->ۤۡ۟ۢ(Ljava/lang/Object;)Lokhttp3/Request;

    move-result-object v0

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۤ۟ۢ()Lokhttp3/OkHttpClient;

    move-result-object v1

    invoke-static {v1, v0}, Lkevin/fun/hook/download/DownloadManager;->ۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Call;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/download/DownloadManager;->۟ۨۡۧ(Ljava/lang/Object;)Lokhttp3/Response;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    move-result-object v4

    :try_start_1
    invoke-static {v4}, Lkevin/fun/hook/download/DownloadManager;->ۣۤۡۡ(Ljava/lang/Object;)Z

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
    invoke-static {v4}, Lkevin/fun/hook/download/DownloadManager;->ۦۡۢ۠(Ljava/lang/Object;)Lokhttp3/ResponseBody;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

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
    :try_start_2
    invoke-static {v1}, Lkevin/fun/hook/download/DownloadManager;->ۣۧۦ(Ljava/lang/Object;)Ljava/io/InputStream;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    move-result-object v5

    :try_start_3
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    const/16 v0, 0x2000

    :try_start_4
    new-array v1, v0, [B

    :sswitch_6
    invoke-static {v5, v1}, Landroidx/loader/ۥۧۨۤ;->ۦۥ۠۠(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v6

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    const/4 v0, -0x1

    if-ne v6, v0, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v0, 0xbe41

    goto :goto_2

    :sswitch_9
    invoke-static {v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۦۢۡۢ(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-static {v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

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
    if-eqz v5, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_c
    :try_start_6
    invoke-static {v5}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    :sswitch_d
    const v0, 0xbefb

    :goto_4
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_e
    const v0, 0xbf39

    goto :goto_4

    :sswitch_f
    if-eqz v4, :cond_4

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_10
    :try_start_7
    invoke-static {v4}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۧۧۡ(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :sswitch_11
    return-void

    :sswitch_12
    const/4 v0, 0x0

    :try_start_8
    invoke-static {v2, v1, v0, v6}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠ۦۤۧ(Ljava/lang/Object;Ljava/lang/Object;II)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    const v0, 0xc202

    :goto_5
    const v6, 0xc213

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_13
    const v0, 0xc221

    goto :goto_5

    :catchall_0
    move-exception v0

    move-object v1, v0

    :try_start_9
    invoke-static {v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V

    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :catchall_1
    move-exception v0

    :goto_6
    const v2, 0xc27e

    :goto_7
    const v3, 0xc28f

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :cond_5
    :sswitch_14
    const v2, 0xc2bc

    goto :goto_7

    :sswitch_15
    if-nez v1, :cond_5

    const v2, 0xc2db

    goto :goto_7

    :sswitch_16
    const v1, 0xc2fa

    :goto_8
    const v2, 0xc30b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :sswitch_17
    const v1, 0xc5a4

    goto :goto_8

    :sswitch_18
    const v2, 0xc601

    :goto_9
    const v3, 0xc612

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_8

    goto :goto_9

    :sswitch_19
    if-eq v1, v0, :cond_6

    const v2, 0xc65e

    goto :goto_9

    :cond_6
    :sswitch_1a
    const v2, 0xc63f

    goto :goto_9

    :sswitch_1b
    :try_start_a
    invoke-static {v1, v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    move-object v0, v1

    :goto_a
    :sswitch_1c
    const v1, 0xc67d

    :goto_b
    const v2, 0xc68e

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_9

    goto :goto_b

    :cond_7
    :sswitch_1d
    const v1, 0xc6bb

    goto :goto_b

    :sswitch_1e
    if-eqz v5, :cond_7

    const v1, 0xc965

    goto :goto_b

    :sswitch_1f
    :try_start_b
    invoke-static {v5}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V

    :sswitch_20
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :catchall_2
    move-exception v2

    :goto_c
    const v1, 0xc984

    :goto_d
    const v3, 0xc995

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_a

    goto :goto_d

    :sswitch_21
    if-eqz v0, :cond_8

    const v1, 0xc9e1

    goto :goto_d

    :cond_8
    :sswitch_22
    const v1, 0xc9c2

    goto :goto_d

    :sswitch_23
    const v1, 0xca00

    :goto_e
    const v3, 0xca11

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_b

    goto :goto_e

    :cond_9
    :sswitch_24
    const v1, 0xca3e

    goto :goto_e

    :sswitch_25
    if-eq v0, v2, :cond_9

    const v1, 0xca5d

    goto :goto_e

    :sswitch_26
    :try_start_c
    invoke-static {v0, v2}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xca7c

    :goto_f
    const v2, 0xca8d

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_c

    goto :goto_f

    :sswitch_27
    const v1, 0xcd26

    goto :goto_f

    :sswitch_28
    move-object v0, v2

    :sswitch_29
    throw v0

    :catchall_3
    move-exception v0

    const v1, 0xcd83

    :goto_10
    const v2, 0xcd94

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_d

    goto :goto_10

    :sswitch_2a
    if-eqz v4, :cond_a

    const v1, 0xcde0

    goto :goto_10

    :sswitch_2b
    new-instance v0, Ljava/io/IOException;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x163

    sget v3, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v3, v3, 0x327

    const/16 v5, 0x7a5

    invoke-static {v1, v2, v3, v5}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_2c
    new-instance v0, Ljava/io/IOException;

    invoke-static {v4}, Lkevin/fun/hook/download/DownloadManager;->ۣۣ۟ۡ۟(Ljava/lang/Object;)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v3

    const/16 v5, 0x168

    sget v6, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v6, v6, -0x251

    const/16 v7, 0x155

    invoke-static {v3, v5, v6, v7}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :cond_a
    :sswitch_2d
    const v1, 0xcdc1

    goto :goto_10

    :sswitch_2e
    :try_start_d
    invoke-static {v4}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۧۧۡ(Ljava/lang/Object;)V

    :sswitch_2f
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :catchall_4
    move-exception v1

    :goto_11
    const v2, 0xcdff

    :goto_12
    const v3, 0xce10

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_e

    goto :goto_12

    :cond_b
    :sswitch_30
    const v2, 0xce3d

    goto :goto_12

    :sswitch_31
    if-eqz v0, :cond_b

    const v2, 0xd0e7

    goto :goto_12

    :sswitch_32
    const v2, 0xd106

    :goto_13
    const v3, 0xd117

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_f

    goto :goto_13

    :sswitch_33
    if-eq v0, v1, :cond_c

    const v2, 0xd163

    goto :goto_13

    :cond_c
    :sswitch_34
    const v2, 0xd144

    goto :goto_13

    :sswitch_35
    invoke-static {v0, v1}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xd182

    :goto_14
    const v2, 0xd193

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_10

    goto :goto_14

    :sswitch_36
    const v1, 0xd1a1

    goto :goto_14

    :sswitch_37
    move-object v0, v1

    :sswitch_38
    throw v0

    :catchall_5
    move-exception v1

    move-object v0, v3

    goto :goto_11

    :catchall_6
    move-exception v2

    move-object v0, v3

    goto/16 :goto_c

    :catchall_7
    move-exception v2

    move-object v0, v1

    goto/16 :goto_c

    :catchall_8
    move-exception v0

    move-object v1, v3

    goto/16 :goto_6

    :sswitch_39
    move-object v0, v1

    goto/16 :goto_a

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_2b
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_12
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

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_13
        0x32 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_18
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x2d -> :sswitch_39
        0x32 -> :sswitch_1a
        0x4c -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1d
        0x35 -> :sswitch_20
        0xf3 -> :sswitch_1e
        0xfeb -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_21
        0x36 -> :sswitch_22
        0x57 -> :sswitch_28
        0x74 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_24
        0x11 -> :sswitch_25
        0x2f -> :sswitch_29
        0x4c -> :sswitch_26
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_27
        0x7ab -> :sswitch_29
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_2a
        0x36 -> :sswitch_2d
        0x55 -> :sswitch_2f
        0x74 -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_30
        0x2d -> :sswitch_37
        0x3ef -> :sswitch_31
        0x1ef7 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_33
        0x32 -> :sswitch_34
        0x53 -> :sswitch_38
        0x74 -> :sswitch_35
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_36
        0x32 -> :sswitch_38
    .end sparse-switch
.end method

.method private downloadFileWithProgress(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Lkevin/fun/hook/download/DownloadManager$ProgressCallback;[Lokhttp3/Call;)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v2, Lokhttp3/Request$Builder;

    invoke-direct {v2}, Lokhttp3/Request$Builder;-><init>()V

    move-object/from16 v0, p2

    invoke-static {v2, v0}, Lkevin/fun/hook/download/DownloadManager;->ۣ۟ۧ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Request$Builder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v3

    const/16 v4, 0x171

    sget v5, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v5, v5, 0x19

    const/16 v6, 0xb91

    invoke-static {v3, v4, v5, v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x17b

    sget v6, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v6, v6, 0x26f

    const/16 v7, 0x46c

    invoke-static {v4, v5, v6, v7}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lkevin/fun/hook/download/DownloadManager;->ۡۧ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Request$Builder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v3

    const/16 v4, 0x1b7

    sget v5, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v5, v5, -0x260

    const/16 v6, 0x2ee

    invoke-static {v3, v4, v5, v6}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x1bd

    sget v6, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v6, v6, 0x4a

    const/16 v7, 0x5f0

    invoke-static {v4, v5, v6, v7}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lkevin/fun/hook/download/DownloadManager;->ۡۧ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Request$Builder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v3

    const/16 v4, 0x1c0

    sget v5, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v5, v5, -0x1d

    const/16 v6, 0x20f

    invoke-static {v3, v4, v5, v6}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x1cf

    sget v6, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v6, v6, -0x6c

    const/16 v7, 0x147

    invoke-static {v4, v5, v6, v7}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lkevin/fun/hook/download/DownloadManager;->ۡۧ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Request$Builder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v3

    const/16 v4, 0x1dd

    sget v5, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v5, v5, 0x3bc

    const/16 v6, 0x6f5

    invoke-static {v3, v4, v5, v6}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x1e2

    sget v6, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v6, v6, -0x1c

    const/16 v7, 0xb82

    invoke-static {v4, v5, v6, v7}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lkevin/fun/hook/download/DownloadManager;->ۡۧ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Request$Builder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v3

    const/16 v4, 0x1ea

    sget v5, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v5, v5, 0xf9

    const/16 v6, 0x663

    invoke-static {v3, v4, v5, v6}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x1f4

    sget v6, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v6, v6, 0x2f4

    const/16 v7, 0x23f

    invoke-static {v4, v5, v6, v7}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lkevin/fun/hook/download/DownloadManager;->ۡۧ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Request$Builder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/download/DownloadManager;->ۤۡ۟ۢ(Ljava/lang/Object;)Lokhttp3/Request;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۤ۟ۢ()Lokhttp3/OkHttpClient;

    move-result-object v3

    invoke-static {v3, v2}, Lkevin/fun/hook/download/DownloadManager;->ۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Call;

    move-result-object v3

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
    if-eqz p5, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 v2, 0x0

    aput-object v3, p5, v2

    :sswitch_3
    invoke-static {v3}, Lkevin/fun/hook/download/DownloadManager;->۟ۨۡۧ(Ljava/lang/Object;)Lokhttp3/Response;

    move-result-object v8

    invoke-static {v8}, Lkevin/fun/hook/download/DownloadManager;->ۣۤۡۡ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {v8}, Lkevin/fun/hook/download/DownloadManager;->ۦۡۢ۠(Ljava/lang/Object;)Lokhttp3/ResponseBody;

    move-result-object v9

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-eqz v9, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v2, 0xbe41

    goto :goto_2

    :sswitch_9
    invoke-static {v9}, Lkevin/fun/hook/download/DownloadManager;->ۣ۟۠ۢۥ(Ljava/lang/Object;)J

    move-result-wide v10

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x0

    :try_start_0
    invoke-static {v9}, Lkevin/fun/hook/download/DownloadManager;->ۣۧۦ(Ljava/lang/Object;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    move-result-object v3

    :try_start_1
    invoke-static {p1}, Landroidx/activity/ۣۦۡۥ;->۟ۢۢ(Ljava/lang/Object;)Landroid/content/ContentResolver;
    :try_end_1
    .catch Ljava/io/InterruptedIOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    move-result-object v2

    :try_start_2
    move-object/from16 v0, p3

    invoke-static {v2, v0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣ۟ۤۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/io/OutputStream;
    :try_end_2
    .catch Ljava/io/InterruptedIOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-result-object v2

    const v4, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_a
    const v4, 0xbebd

    goto :goto_3

    :sswitch_b
    if-eqz v2, :cond_3

    const v4, 0xbedc

    goto :goto_3

    :sswitch_c
    const/high16 v4, 0x40000

    :try_start_3
    new-array v9, v4, [B

    const-wide/16 v4, 0x0

    move-wide v6, v4

    :goto_4
    invoke-static {v3, v9}, Landroidx/loader/ۥۧۨۤ;->ۦۥ۠۠(Ljava/lang/Object;Ljava/lang/Object;)I
    :try_end_3
    .catch Ljava/io/InterruptedIOException; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    move-result v5

    const v4, 0xbefb

    :goto_5
    const v12, 0xbf0c

    xor-int/2addr v4, v12

    sparse-switch v4, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_d
    const v4, 0xbf39

    goto :goto_5

    :sswitch_e
    const/4 v4, -0x1

    if-ne v5, v4, :cond_4

    const v4, 0xc1e3

    goto :goto_5

    :sswitch_f
    :try_start_4
    invoke-static {v2}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۢۨۥ(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/io/InterruptedIOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    const v4, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    if-eqz v2, :cond_5

    const v4, 0xc25f

    goto :goto_6

    :cond_5
    :sswitch_11
    const v4, 0xc240

    goto :goto_6

    :sswitch_12
    :try_start_5
    invoke-static {v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡۦۣ(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :sswitch_13
    const v2, 0xc27e

    :goto_7
    const v4, 0xc28f

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :sswitch_14
    const v2, 0xc601

    :goto_8
    const v4, 0xc612

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_15
    if-eqz v3, :cond_6

    const v2, 0xc65e

    goto :goto_8

    :sswitch_16
    const v2, 0xc29d

    goto :goto_7

    :catchall_0
    move-exception v2

    const v2, 0xc2fa

    :goto_9
    const v4, 0xc30b

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_8

    goto :goto_9

    :sswitch_17
    const v2, 0xc5a4

    goto :goto_9

    :cond_6
    :sswitch_18
    const v2, 0xc63f

    goto :goto_8

    :sswitch_19
    :try_start_6
    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :sswitch_1a
    const v2, 0xc67d

    :goto_a
    const v3, 0xc68e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_9

    goto :goto_a

    :sswitch_1b
    invoke-static {v8}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۧۧۡ(Ljava/lang/Object;)V

    const v2, 0xca00

    :goto_b
    const v3, 0xca11

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_a

    goto :goto_b

    :cond_7
    :sswitch_1c
    const v2, 0xca3e

    goto :goto_b

    :sswitch_1d
    const v2, 0xc69c

    goto :goto_a

    :catchall_1
    move-exception v2

    const v2, 0xc984

    :goto_c
    const v3, 0xc995

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_b

    goto :goto_c

    :sswitch_1e
    const v2, 0xc9a3

    goto :goto_c

    :sswitch_1f
    if-eqz p5, :cond_7

    const v2, 0xca5d

    goto :goto_b

    :sswitch_20
    const/4 v2, 0x0

    const/4 v3, 0x0

    aput-object v3, p5, v2

    :sswitch_21
    return-void

    :catchall_2
    move-exception v4

    const v5, 0xca7c

    :goto_d
    const v6, 0xca8d

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_c

    goto :goto_d

    :sswitch_22
    const v5, 0xcd26

    goto :goto_d

    :catch_0
    move-exception v5

    const v4, 0xcd83

    :goto_e
    const v6, 0xcd94

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_d

    goto :goto_e

    :sswitch_23
    const v4, 0xcda2

    goto :goto_e

    :sswitch_24
    const v4, 0xcdff

    :goto_f
    const v12, 0xce10

    xor-int/2addr v4, v12

    sparse-switch v4, :sswitch_data_e

    goto :goto_f

    :cond_8
    :sswitch_25
    const v4, 0xce3d

    goto :goto_f

    :sswitch_26
    if-eqz p5, :cond_8

    const v4, 0xd0e7

    goto :goto_f

    :sswitch_27
    const/4 v4, 0x0

    :try_start_7
    aget-object v12, p5, v4

    const v4, 0xd106

    :goto_10
    const v13, 0xd117

    xor-int/2addr v4, v13

    sparse-switch v4, :sswitch_data_f

    goto :goto_10

    :sswitch_28
    if-eqz v12, :cond_9

    const v4, 0xd163

    goto :goto_10

    :cond_9
    :sswitch_29
    const v4, 0xd144

    goto :goto_10

    :sswitch_2a
    const/4 v4, 0x0

    aget-object v4, p5, v4

    invoke-static {v4}, Lkevin/fun/hook/download/DownloadManager;->ۢۡۦۦ(Ljava/lang/Object;)Z

    move-result v12

    const v4, 0xd182

    :goto_11
    const v13, 0xd193

    xor-int/2addr v4, v13

    sparse-switch v4, :sswitch_data_10

    goto :goto_11

    :sswitch_2b
    if-nez v12, :cond_a

    const v4, 0xd1df

    goto :goto_11

    :cond_a
    :sswitch_2c
    const v4, 0xd1c0

    goto :goto_11

    :sswitch_2d
    const v4, 0xd1fe

    :goto_12
    const v12, 0xd20f

    xor-int/2addr v4, v12

    sparse-switch v4, :sswitch_data_11

    goto :goto_12

    :sswitch_2e
    const v4, 0xd4a8

    goto :goto_12

    :sswitch_2f
    new-instance v4, Ljava/io/InterruptedIOException;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v5

    const/16 v6, 0x1fe

    sget v7, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v7, v7, -0x27e

    const/16 v9, 0x40e

    invoke-static {v5, v6, v7, v9}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_7
    .catch Ljava/io/InterruptedIOException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :sswitch_30
    const/4 v4, 0x0

    :try_start_8
    invoke-static {v2, v9, v4, v5}, Landroidx/activity/ۣۦۡۥ;->ۢۧ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;II)V
    :try_end_8
    .catch Ljava/io/InterruptedIOException; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    int-to-long v4, v5

    add-long/2addr v4, v6

    const v6, 0xd505

    :goto_13
    const v7, 0xd516

    xor-int/2addr v6, v7

    sparse-switch v6, :sswitch_data_12

    goto :goto_13

    :sswitch_31
    if-eqz p4, :cond_b

    const v6, 0xd562

    goto :goto_13

    :cond_b
    :sswitch_32
    const v6, 0xd543

    goto :goto_13

    :sswitch_33
    :try_start_9
    move-object/from16 v0, p4

    invoke-static {v0, v4, v5, v10, v11}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۥۧ(Ljava/lang/Object;JJ)V

    :sswitch_34
    const v6, 0xd581

    :goto_14
    const v7, 0xd592

    xor-int/2addr v6, v7

    sparse-switch v6, :sswitch_data_13

    goto :goto_14

    :sswitch_35
    const v6, 0xd5a0

    goto :goto_14

    :sswitch_36
    move-wide v6, v4

    goto/16 :goto_4

    :sswitch_37
    new-instance v4, Ljava/io/IOException;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v5

    const/16 v6, 0x210

    sget v7, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v7, v7, -0x25f

    const/16 v9, 0x1d5

    invoke-static {v5, v6, v7, v9}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_9
    .catch Ljava/io/InterruptedIOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :catch_1
    move-exception v5

    const v4, 0xd888

    :goto_15
    const v6, 0xd899

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_14

    goto :goto_15

    :sswitch_38
    const v4, 0xd8a7

    goto :goto_15

    :catchall_3
    move-exception v4

    move-object v2, v5

    :goto_16
    const v5, 0xd904

    :goto_17
    const v6, 0xd915

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_15

    goto :goto_17

    :sswitch_39
    const v5, 0xd923

    goto :goto_17

    :catch_2
    move-exception v4

    move-object v2, v6

    :goto_18
    const v5, 0xd980

    :goto_19
    const v6, 0xd991

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_16

    goto :goto_19

    :sswitch_3a
    const v5, 0xdc2a

    goto :goto_19

    :sswitch_3b
    move-object v5, v4

    :goto_1a
    :sswitch_3c
    :try_start_a
    throw v5
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catchall_4
    move-exception v4

    :sswitch_3d
    const v5, 0xdd03

    :goto_1b
    const v6, 0xdd14

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_17

    goto :goto_1b

    :sswitch_3e
    if-eqz v2, :cond_c

    const v5, 0x170090

    goto :goto_1b

    :catchall_5
    move-exception v4

    :sswitch_3f
    const v5, 0xdc87

    :goto_1c
    const v6, 0xdc98

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_18

    goto :goto_1c

    :sswitch_40
    const v5, 0xdca6

    goto :goto_1c

    :catch_3
    move-exception v5

    move-object v3, v7

    :goto_1d
    move-object v2, v4

    goto :goto_1a

    :cond_c
    :sswitch_41
    const v5, 0xdd41

    goto :goto_1b

    :sswitch_42
    :try_start_b
    invoke-static {v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡۦۣ(Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :sswitch_43
    const v2, 0x1700af

    :goto_1e
    const v5, 0x1700c0

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_19

    goto :goto_1e

    :sswitch_44
    const v2, 0x1701a7

    :goto_1f
    const v5, 0x1701b8

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_1a

    goto :goto_1f

    :sswitch_45
    if-eqz v3, :cond_d

    const v2, 0x17048f

    goto :goto_1f

    :sswitch_46
    const v2, 0x1700ce

    goto :goto_1e

    :catchall_6
    move-exception v2

    const v2, 0x17012b

    :goto_20
    const v5, 0x17013c

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_1b

    goto :goto_20

    :sswitch_47
    const v2, 0x17014a

    goto :goto_20

    :cond_d
    :sswitch_48
    const v2, 0x170470

    goto :goto_1f

    :sswitch_49
    :try_start_c
    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    :sswitch_4a
    const v2, 0x1704ae

    :goto_21
    const v3, 0x1704bf

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_1c

    goto :goto_21

    :sswitch_4b
    const v2, 0x1704cd

    goto :goto_21

    :catchall_7
    move-exception v2

    const v2, 0x17052a

    :goto_22
    const v3, 0x17053b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_1d

    goto :goto_22

    :sswitch_4c
    const v2, 0x170549

    goto :goto_22

    :sswitch_4d
    invoke-static {v8}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۧۧۡ(Ljava/lang/Object;)V

    const v2, 0x170831

    :goto_23
    const v3, 0x170842

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_1e

    goto :goto_23

    :cond_e
    :sswitch_4e
    const v2, 0x17086f

    goto :goto_23

    :sswitch_4f
    if-eqz p5, :cond_e

    const v2, 0x17088e

    goto :goto_23

    :sswitch_50
    const/4 v2, 0x0

    const/4 v3, 0x0

    aput-object v3, p5, v2

    :sswitch_51
    throw v4

    :sswitch_52
    new-instance v2, Ljava/io/IOException;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v3

    const/16 v4, 0x217

    sget v5, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v5, v5, -0x1e6

    const/16 v6, 0x741

    invoke-static {v3, v4, v5, v6}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_53
    invoke-static {v8}, Lkevin/fun/hook/download/DownloadManager;->ۣۣ۟ۡ۟(Ljava/lang/Object;)I

    move-result v2

    new-instance v3, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v5

    const/16 v6, 0x225

    sget v7, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v7, v7, -0x80

    const/16 v8, 0xbbe

    invoke-static {v5, v6, v7, v8}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v2}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3

    :catch_4
    move-exception v5

    goto/16 :goto_1d

    :catch_5
    move-exception v4

    goto/16 :goto_18

    :catchall_8
    move-exception v4

    goto/16 :goto_16

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
        0x1d7 -> :sswitch_53
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_52
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_37
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_24
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0xf1 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x13 -> :sswitch_15
        0x2d -> :sswitch_1b
        0x32 -> :sswitch_18
        0x4c -> :sswitch_19
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_13
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0xf3 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0xe -> :sswitch_1c
        0x11 -> :sswitch_1f
        0x2f -> :sswitch_21
        0x4c -> :sswitch_20
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_22
        0x7ab -> :sswitch_3d
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_23
        0x36 -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_25
        0x2d -> :sswitch_30
        0x3ef -> :sswitch_26
        0x1ef7 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_28
        0x32 -> :sswitch_29
        0x53 -> :sswitch_30
        0x74 -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_2b
        0x32 -> :sswitch_2c
        0x4c -> :sswitch_2d
        0x53 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_2e
        0x6a7 -> :sswitch_30
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_31
        0x32 -> :sswitch_32
        0x55 -> :sswitch_34
        0x74 -> :sswitch_33
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_35
        0x32 -> :sswitch_36
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_38
        0x3e -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_39
        0x36 -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_3a
        0x5bb -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x17 -> :sswitch_3e
        0x36 -> :sswitch_41
        0x55 -> :sswitch_44
        0x17dd84 -> :sswitch_42
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x1f -> :sswitch_40
        0x3e -> :sswitch_3d
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_44
        0x6f -> :sswitch_46
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x1f -> :sswitch_45
        0x537 -> :sswitch_49
        0x5c8 -> :sswitch_4d
        0x5e9 -> :sswitch_48
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x17 -> :sswitch_47
        0x76 -> :sswitch_43
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_4b
        0x72 -> :sswitch_4d
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_4c
        0x72 -> :sswitch_4a
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x12 -> :sswitch_4e
        0x2d -> :sswitch_51
        0x73 -> :sswitch_4f
        0xcc -> :sswitch_50
    .end sparse-switch
.end method

.method private downloadImageToTempFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v1, Ljava/io/File;

    invoke-static {p1}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۧ۠ۥۨ(Ljava/lang/Object;)Ljava/io/File;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x22a

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v4, v4, -0x72

    const/16 v5, 0xae0

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v1}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

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
    invoke-static {v1}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۧۤۢۦ(Ljava/lang/Object;)Z

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
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v0, Ljava/io/IOException;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x235

    sget v3, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v3, v3, -0x67

    const/16 v4, 0xb24

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_8
    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v2

    new-instance v0, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v5

    const/16 v6, 0x23d

    sget v7, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v7, v7, -0x19

    const/16 v8, 0x85a

    invoke-static {v5, v6, v7, v8}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v2, v3}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v3

    const/16 v4, 0x248

    sget v5, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v5, v5, 0x1bb

    const/16 v6, 0xc49

    invoke-static {v3, v4, v5, v6}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {p0, p2, v0}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۢ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

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

.method private downloadLivePhoto(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V
    .locals 14

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x24c

    sget v4, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v4, v4, 0x95

    const/16 v5, 0x833

    invoke-static {v2, v3, v4, v5}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v11

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x265

    sget v4, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v4, v4, 0xda

    const/16 v5, 0x627

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v12

    xor-int/lit8 v5, p4, 0x1

    const/4 v2, 0x1

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
    if-eqz v11, :cond_0

    const/16 v3, 0x6ad

    goto :goto_0

    :sswitch_2
    sget v2, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v2, v2, -0x1e7

    add-int/lit8 v2, v2, 0x1

    :sswitch_3
    const/16 v3, 0x6cc

    :goto_1
    xor-int/lit16 v3, v3, 0x6dd

    sparse-switch v3, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v12, :cond_1

    const/16 v3, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v3, 0x70a

    goto :goto_1

    :sswitch_6
    sget v3, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v3, v3, 0x383

    add-int/2addr v2, v3

    :sswitch_7
    const/16 v3, 0x748

    :goto_2
    xor-int/lit16 v3, v3, 0x759

    sparse-switch v3, :sswitch_data_2

    goto :goto_2

    :sswitch_8
    if-eqz v5, :cond_2

    const v3, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_9
    const v3, 0xbe41

    goto :goto_2

    :sswitch_a
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v3

    invoke-static {v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۥ۟ۡ(Ljava/lang/Object;)Z

    move-result v4

    const v3, 0xbe7f

    :goto_3
    const v6, 0xbe90

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_b
    const v3, 0xbebd

    goto :goto_3

    :sswitch_c
    if-nez v4, :cond_3

    const v3, 0xbedc

    goto :goto_3

    :sswitch_d
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v3

    invoke-static {v3, v2}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۥۨ۠ۨ(Ljava/lang/Object;I)V

    const v2, 0xbefb

    :goto_4
    const v3, 0xbf0c

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :sswitch_e
    new-instance v4, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x0

    invoke-direct {v4, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۥۣ۟()Ljava/util/concurrent/ExecutorService;

    move-result-object v13

    new-instance v2, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda0;

    move-object v3, p0

    move/from16 v6, p5

    move-object v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p6

    invoke-direct/range {v2 .. v10}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda0;-><init>(Lkevin/fun/hook/download/DownloadManager;Ljava/util/concurrent/atomic/AtomicInteger;ZZLandroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v13, v2}, Landroidx/activity/ۣۦۡۥ;->۟ۢ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0xc601

    :goto_5
    const v3, 0xc612

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    if-eqz v11, :cond_6

    const v2, 0xc65e

    goto :goto_5

    :sswitch_10
    const v2, 0xbf1a

    goto :goto_4

    :sswitch_11
    const v3, 0xc202

    :goto_6
    const v4, 0xc213

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_6

    goto :goto_6

    :sswitch_12
    if-nez v5, :cond_4

    const v3, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_13
    const v3, 0xc240

    goto :goto_6

    :sswitch_14
    const v3, 0xc27e

    :goto_7
    const v4, 0xc28f

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_7

    goto :goto_7

    :cond_5
    :sswitch_15
    const v3, 0xc2bc

    goto :goto_7

    :sswitch_16
    if-eqz p4, :cond_5

    const v3, 0xc2db

    goto :goto_7

    :sswitch_17
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v3

    invoke-static {v3, v2}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۥۨ۠ۨ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v6, 0x27e

    sget v7, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v7, v7, 0x226

    const/16 v8, 0x696

    invoke-static {v4, v6, v7, v8}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, p1, v2, v4}, Landroidx/viewpager/ۣۢ۟ۤ;->۠ۥۣۤ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    const v2, 0xc2fa

    :goto_8
    const v3, 0xc30b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_8

    goto :goto_8

    :sswitch_18
    const v2, 0xc5a4

    goto :goto_8

    :cond_6
    :sswitch_19
    const v2, 0xc63f

    goto :goto_5

    :sswitch_1a
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۥۣ۟()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    new-instance v3, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda8;

    move/from16 v0, p5

    move-object/from16 v1, p3

    invoke-direct {v3, p0, v0, p1, v1}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda8;-><init>(Lkevin/fun/hook/download/DownloadManager;ZLandroid/content/Context;Ljava/lang/String;)V

    invoke-static {v2, v3}, Landroidx/activity/ۣۦۡۥ;->۟ۢ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0xc67d

    :goto_9
    const v3, 0xc68e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_9

    goto :goto_9

    :sswitch_1b
    const v2, 0xc984

    :goto_a
    const v3, 0xc995

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_a

    goto :goto_a

    :sswitch_1c
    if-eqz v12, :cond_7

    const v2, 0xc9e1

    goto :goto_a

    :sswitch_1d
    const v2, 0xc69c

    goto :goto_9

    :cond_7
    :sswitch_1e
    const v2, 0xc9c2

    goto :goto_a

    :sswitch_1f
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۥۣ۟()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    new-instance v3, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda9;

    move/from16 v0, p5

    move-object/from16 v1, p2

    invoke-direct {v3, p0, v0, p1, v1}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda9;-><init>(Lkevin/fun/hook/download/DownloadManager;ZLandroid/content/Context;Ljava/lang/String;)V

    invoke-static {v2, v3}, Landroidx/activity/ۣۦۡۥ;->۟ۢ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0xca00

    :goto_b
    const v3, 0xca11

    xor-int/2addr v2, v3

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_b

    :pswitch_1
    :sswitch_20
    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

    move-result v3

    const v2, 0xca7c

    :goto_c
    const v4, 0xca8d

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_b

    goto :goto_c

    :sswitch_21
    if-gtz v3, :cond_8

    const v2, 0xcd64

    goto :goto_c

    :pswitch_2
    const v2, 0xca1f

    goto :goto_b

    :cond_8
    :sswitch_22
    const v2, 0xcd45

    goto :goto_c

    :sswitch_23
    const-string v2, "dbz"

    invoke-static {v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۧۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(I)V

    :sswitch_24
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

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_11
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
        0x13 -> :sswitch_f
        0x2d -> :sswitch_1b
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_12
        0x32 -> :sswitch_13
        0x4c -> :sswitch_14
        0x53 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_15
        0x33 -> :sswitch_e
        0x54 -> :sswitch_17
        0xf1 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_18
        0x6af -> :sswitch_e
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0xf3 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1c
        0x36 -> :sswitch_1e
        0x57 -> :sswitch_20
        0x74 -> :sswitch_1f
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        0xf1 -> :sswitch_21
        0x7ab -> :sswitch_22
        0x7c8 -> :sswitch_24
        0x7e9 -> :sswitch_23
    .end sparse-switch
.end method

.method private dp(Landroid/content/Context;F)I
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
    if-nez p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/high16 v0, 0x40400000    # 3.0f

    mul-float/2addr v0, p2

    float-to-int v0, v0

    :goto_1
    return v0

    :sswitch_3
    invoke-static {p1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۨ۟ۨ(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟۟ۤۦۤ(Ljava/lang/Object;)Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦۡۧ(Ljava/lang/Object;)F

    move-result v0

    mul-float/2addr v0, p2

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

.method private findOutputFileFromCache(Ljava/lang/String;J)Ljava/io/File;
    .locals 14

    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟۠ۤ۟ۧ(Ljava/lang/Object;)[Ljava/io/File;

    move-result-object v3

    const/16 v0, 0x650

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
    const/4 v0, 0x0

    :goto_1
    return-object v0

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v4

    array-length v6, v3

    const/4 v0, 0x0

    :sswitch_4
    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-lt v0, v6, :cond_1

    const/16 v1, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v1, 0x70a

    goto :goto_2

    :sswitch_7
    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    const v0, 0xbe22

    goto :goto_3

    :sswitch_9
    aget-object v1, v3, v0

    invoke-static {v1}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۡۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v7

    const/16 v8, 0x286

    sget v9, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v9, v9, -0x215

    const/16 v10, 0x956

    invoke-static {v7, v8, v9, v10}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Landroidx/core/ۧ۟ۤۨ;->ۨۨ۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v2, 0xbe7f

    :goto_4
    const v8, 0xbe90

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_a
    const v2, 0xbebd

    goto :goto_4

    :sswitch_b
    if-eqz v7, :cond_2

    const v2, 0xbedc

    goto :goto_4

    :sswitch_c
    invoke-static {v1}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۡۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v7

    const/16 v8, 0x291

    sget v9, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v9, v9, -0x1f0

    const/16 v10, 0xcc9

    invoke-static {v7, v8, v9, v10}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Landroidx/activity/ۤۧۧۧ;->۟۟ۤۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v2, 0xbefb

    :goto_5
    const v8, 0xbf0c

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_d
    const v2, 0xbf39

    goto :goto_5

    :sswitch_e
    if-eqz v7, :cond_3

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_f
    invoke-static {v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۤۧ۠(Ljava/lang/Object;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v8

    const v2, 0xc202

    :goto_6
    const v7, 0xc213

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    sub-long v10, v4, v8

    const-wide/16 v12, 0x1388

    cmp-long v2, v10, v12

    if-gez v2, :cond_4

    const v2, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_11
    const v2, 0xc240

    goto :goto_6

    :sswitch_12
    move-object v0, v1

    goto/16 :goto_1

    :sswitch_13
    sget v1, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v1, v1, 0x8d

    add-int/2addr v0, v1

    const v1, 0xc27e

    :goto_7
    const v2, 0xc28f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :sswitch_14
    const v1, 0xc29d

    goto :goto_7

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x295

    sget v4, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v4, v4, -0x76

    const/16 v5, 0x716

    invoke-static {v2, v3, v4, v5}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/download/DownloadManager;->ۡۨ۟(Ljava/lang/Object;)V

    :sswitch_15
    const/4 v0, 0x0

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
        0x11 -> :sswitch_5
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_9
        0x1f4 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb97b -> :sswitch_15
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_13
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_13
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_4
        0xf1 -> :sswitch_14
    .end sparse-switch
.end method

.method private findProgressViews(Landroid/view/View;[Landroid/widget/TextView;[Landroid/widget/ProgressBar;[Landroid/widget/TextView;)V
    .locals 6

    const/4 v1, 0x0

    instance-of v2, p1, Landroid/widget/TextView;

    const/16 v0, 0x650

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
    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۥ۟ۦ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨۡۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v3, 0x2b0

    sget v4, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v4, v4, -0x4f

    const/16 v5, 0x2c9

    invoke-static {v0, v3, v4, v5}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۢ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    aget-object v3, p2, v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez v3, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    aput-object v0, p2, v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    const v0, 0xc67d

    :goto_4
    const v2, 0xc68e

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_a
    instance-of v2, p1, Landroid/view/ViewGroup;

    const v0, 0xcd83

    :goto_5
    const v3, 0xcd94

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_b
    if-eqz v2, :cond_9

    const v0, 0xcde0

    goto :goto_5

    :sswitch_c
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_d
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v3, 0x2b4

    sget v4, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v4, v4, -0x26e

    const/16 v5, 0x95c

    invoke-static {v0, v3, v4, v5}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xbefb

    :goto_6
    const v4, 0xbf0c

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_6

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
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v3, 0x2b6

    sget v4, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v4, v4, 0x11

    const/16 v5, 0xbe9

    invoke-static {v0, v3, v4, v5}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xc202

    :goto_7
    const v4, 0xc213

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_11
    if-nez v3, :cond_4

    const v0, 0xc25f

    goto :goto_7

    :cond_4
    :sswitch_12
    const v0, 0xc240

    goto :goto_7

    :sswitch_13
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v3, 0x2b8

    sget v4, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v4, v4, -0x1bf

    const/16 v5, 0x437

    invoke-static {v0, v3, v4, v5}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc27e

    :goto_8
    const v3, 0xc28f

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_8

    goto :goto_8

    :cond_5
    :sswitch_14
    const v0, 0xc2bc

    goto :goto_8

    :sswitch_15
    if-eqz v2, :cond_5

    const v0, 0xc2db

    goto :goto_8

    :sswitch_16
    aget-object v2, p4, v1

    const v0, 0xc2fa

    :goto_9
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_9

    goto :goto_9

    :sswitch_17
    if-nez v2, :cond_6

    const v0, 0xc5e2

    goto :goto_9

    :cond_6
    :sswitch_18
    const v0, 0xc5c3

    goto :goto_9

    :sswitch_19
    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    aput-object v0, p4, v1

    const v0, 0xc601

    :goto_a
    const v2, 0xc612

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_a

    goto :goto_a

    :sswitch_1a
    const v0, 0xc620

    goto :goto_a

    :sswitch_1b
    const v0, 0xc69c

    goto/16 :goto_4

    :sswitch_1c
    instance-of v2, p1, Landroid/widget/ProgressBar;

    const v0, 0xc984

    :goto_b
    const v3, 0xc995

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_b

    goto :goto_b

    :sswitch_1d
    if-eqz v2, :cond_7

    const v0, 0xc9e1

    goto :goto_b

    :cond_7
    :sswitch_1e
    const v0, 0xc9c2

    goto :goto_b

    :sswitch_1f
    aget-object v2, p3, v1

    const v0, 0xca00

    :goto_c
    const v3, 0xca11

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_c

    goto :goto_c

    :cond_8
    :sswitch_20
    const v0, 0xca3e

    goto :goto_c

    :sswitch_21
    if-nez v2, :cond_8

    const v0, 0xca5d

    goto :goto_c

    :sswitch_22
    move-object v0, p1

    check-cast v0, Landroid/widget/ProgressBar;

    aput-object v0, p3, v1

    const v0, 0xca7c

    :goto_d
    const v2, 0xca8d

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_d

    goto :goto_d

    :sswitch_23
    const v0, 0xcd26

    goto :goto_d

    :cond_9
    :sswitch_24
    const v0, 0xcdc1

    goto/16 :goto_5

    :sswitch_25
    check-cast p1, Landroid/view/ViewGroup;

    move v0, v1

    :sswitch_26
    invoke-static {p1}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣۣۡ(Ljava/lang/Object;)I

    move-result v2

    const v1, 0xcdff

    :goto_e
    const v3, 0xce10

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_e

    goto :goto_e

    :cond_a
    :sswitch_27
    const v1, 0xce3d

    goto :goto_e

    :sswitch_28
    if-lt v0, v2, :cond_a

    const v1, 0xd0e7

    goto :goto_e

    :sswitch_29
    const v0, 0xd106

    :goto_f
    const v1, 0xd117

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_f

    goto :goto_f

    :sswitch_2a
    const v0, 0xd125

    goto :goto_f

    :sswitch_2b
    invoke-static {p1, v0}, Landroidx/loader/ۡۢۢ;->ۥۨۤۦ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    invoke-static {p0, v1, p2, p3, p4}, Lkevin/fun/hook/download/DownloadManager;->۟ۦۣۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    sget v1, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v1, v1, 0x11f

    add-int/2addr v0, v1

    const v1, 0xd182

    :goto_10
    const v2, 0xd193

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_10

    goto :goto_10

    :sswitch_2c
    const v1, 0xd1a1

    goto :goto_10

    :sswitch_2d
    invoke-static {}, Landroidx/interpolator/ۦۨۢۦ;->ۣۤۦۦ()I

    move-result v1

    const v0, 0xd1fe

    :goto_11
    const v2, 0xd20f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_11

    goto :goto_11

    :sswitch_2e
    if-ltz v1, :cond_b

    const v0, 0xd4e6

    goto :goto_11

    :cond_b
    :sswitch_2f
    const v0, 0xd4c7

    goto :goto_11

    :sswitch_30
    const-string v0, "2SVDciCwgA52BGyMxixun"

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۣۣ۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_31
    return-void

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
        0x1d7 -> :sswitch_d
        0x1f4 -> :sswitch_5
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
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x12 -> :sswitch_a
        0xf3 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x17 -> :sswitch_b
        0x36 -> :sswitch_24
        0x55 -> :sswitch_2d
        0x74 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_16
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_12
        0x4c -> :sswitch_13
        0x53 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_9
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_18
        0x6c8 -> :sswitch_9
        0x6e9 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x13 -> :sswitch_1a
        0x32 -> :sswitch_a
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_1d
        0x36 -> :sswitch_1e
        0x57 -> :sswitch_a
        0x74 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xe -> :sswitch_20
        0x11 -> :sswitch_21
        0x2f -> :sswitch_a
        0x4c -> :sswitch_22
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xf1 -> :sswitch_23
        0x7ab -> :sswitch_a
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_27
        0x2d -> :sswitch_2b
        0x3ef -> :sswitch_28
        0x1ef7 -> :sswitch_29
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2a
        0x32 -> :sswitch_2d
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_2c
        0x32 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_2e
        0x6a7 -> :sswitch_2f
        0x6c8 -> :sswitch_31
        0x6e9 -> :sswitch_30
    .end sparse-switch
.end method

.method private generateFileName(Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;
    .locals 19

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x2bb

    sget v4, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v4, v4, 0xe3

    const/16 v5, 0x91b

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v3

    const/16 v4, 0x2cb

    sget v5, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v5, v5, -0x68

    const/16 v6, 0x1e5

    invoke-static {v3, v4, v5, v6}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۦۥۣ۟()Ljava/util/Locale;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v3

    const/16 v4, 0x2dd

    sget v5, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v5, v5, -0x166

    const/16 v7, 0x92d

    invoke-static {v3, v4, v5, v7}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v7

    new-instance v3, Ljava/text/SimpleDateFormat;

    invoke-direct {v3, v7, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-static {v3, v2}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣ۟ۧۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x2ec

    sget v4, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v4, v4, -0x3c1

    const/16 v5, 0x737

    invoke-static {v2, v3, v4, v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x2f2

    sget v4, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v4, v4, -0x10f

    const/16 v5, 0x518

    invoke-static {v2, v3, v4, v5}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v10

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x2f8

    sget v4, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v4, v4, 0x280

    const/16 v5, 0xc8d

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v11

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x2fc

    sget v4, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v4, v4, -0x325

    const/16 v5, 0xc0e

    invoke-static {v2, v3, v4, v5}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v12

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x302

    sget v4, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v4, v4, -0x73

    const/16 v5, 0x586

    invoke-static {v2, v3, v4, v5}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v13

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x309

    sget v4, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v4, v4, 0x163

    const/16 v5, 0x4c3

    invoke-static {v2, v3, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v4, 0x30e

    sget v5, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v5, v5, -0x1c2

    const/16 v14, 0xa1a

    invoke-static {v2, v4, v5, v14}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v14

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v4, 0x313

    sget v5, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v5, v5, -0x4f

    const/16 v15, 0x753

    invoke-static {v2, v4, v5, v15}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x317

    sget v15, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v15, v15, -0x80

    const/16 v16, 0x357

    move/from16 v0, v16

    invoke-static {v4, v5, v15, v0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v15

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x31c

    sget v16, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, -0x3be

    move/from16 v16, v0

    const/16 v17, 0x6a8

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v4, v5, v0, v1}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v16

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v4

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
    if-eqz p2, :cond_0

    const/16 v5, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->ۦۤۨ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v17

    const/16 v5, 0x6cc

    :goto_1
    xor-int/lit16 v5, v5, 0x6dd

    sparse-switch v5, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v17, :cond_1

    const/16 v5, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v5, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v5, 0x748

    :goto_2
    xor-int/lit16 v5, v5, 0x759

    sparse-switch v5, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v5, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->ۦۤۨ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :sswitch_8
    invoke-static {v6, v15, v2}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->ۡۥۢۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v6

    const v2, 0xbe7f

    :goto_3
    const v15, 0xbe90

    xor-int/2addr v2, v15

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v2, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v6, :cond_2

    const v2, 0xbedc

    goto :goto_3

    :sswitch_b
    const v2, 0xbefb

    :goto_4
    const v6, 0xbf0c

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :sswitch_c
    move-object v2, v3

    :goto_5
    invoke-static {v5, v14, v2}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۦۧۧ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v5

    const v2, 0xc202

    :goto_6
    const v6, 0xc213

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_d
    if-eqz v5, :cond_3

    const v2, 0xc25f

    goto :goto_6

    :sswitch_e
    const v2, 0xbf1a

    goto :goto_4

    :sswitch_f
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->ۡۥۢۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_5

    :cond_3
    :sswitch_10
    const v2, 0xc240

    goto :goto_6

    :sswitch_11
    const v2, 0xc27e

    :goto_7
    const v5, 0xc28f

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :sswitch_12
    move-object v2, v4

    :goto_8
    invoke-static {v3, v13, v2}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۧ۟ۧ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xc2fa

    :goto_9
    const v6, 0xc30b

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_7

    goto :goto_9

    :sswitch_13
    if-eqz v3, :cond_4

    const v2, 0xc5e2

    goto :goto_9

    :sswitch_14
    const v2, 0xc29d

    goto :goto_7

    :sswitch_15
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۦۧۧ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_8

    :cond_4
    :sswitch_16
    const v2, 0xc5c3

    goto :goto_9

    :sswitch_17
    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v2

    invoke-static {v2, v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۧۢۨۦ(J)Ljava/lang/String;

    move-result-object v2

    const v3, 0xc601

    :goto_a
    const v6, 0xc612

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_8

    goto :goto_a

    :sswitch_18
    const v3, 0xc620

    goto :goto_a

    :sswitch_19
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۧ۟ۧ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :sswitch_1a
    invoke-static {v5, v12, v2}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۧۧۥۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v5

    const v2, 0xc67d

    :goto_b
    const v6, 0xc68e

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_9

    goto :goto_b

    :cond_5
    :sswitch_1b
    const v2, 0xc6bb

    goto :goto_b

    :sswitch_1c
    if-eqz v5, :cond_5

    const v2, 0xc965

    goto :goto_b

    :sswitch_1d
    const v2, 0xc984

    :goto_c
    const v5, 0xc995

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_a

    goto :goto_c

    :sswitch_1e
    const v2, 0xc9a3

    goto :goto_c

    :sswitch_1f
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۧۧۥۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/emoji2/ۢۧۡۧ;->ۤۥۨۢ(Ljava/lang/Object;)I

    move-result v4

    const v2, 0xca00

    :goto_d
    const v5, 0xca11

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_b

    goto :goto_d

    :cond_6
    :sswitch_20
    const v2, 0xca3e

    goto :goto_d

    :sswitch_21
    const/16 v2, 0x14

    if-le v4, v2, :cond_6

    const v2, 0xca5d

    goto :goto_d

    :sswitch_22
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۧۧۥۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    sget v5, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v5, v5, 0x31c

    invoke-static {v2, v4, v5}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۦ۠ۡ۠(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v4, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v2, 0xca7c

    :goto_e
    const v5, 0xca8d

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_c

    goto :goto_e

    :sswitch_23
    const v2, 0xcd26

    goto :goto_e

    :sswitch_24
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۧۧۥۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    :sswitch_25
    invoke-static {v3, v11, v4}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۠۠ۤۢ(Ljava/lang/Object;)J

    move-result-wide v12

    const v2, 0xcd83

    :goto_f
    const v3, 0xcd94

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_d

    goto :goto_f

    :sswitch_26
    const-wide/16 v2, 0x0

    cmp-long v2, v12, v2

    if-lez v2, :cond_7

    const v2, 0xcde0

    goto :goto_f

    :cond_7
    :sswitch_27
    const v2, 0xcdc1

    goto :goto_f

    :sswitch_28
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۦۥۣ۟()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {v2, v7, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v3, Ljava/util/Date;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۠۠ۤۢ(Ljava/lang/Object;)J

    move-result-wide v6

    const-wide/16 v12, 0x3e8

    mul-long/2addr v6, v12

    invoke-direct {v3, v6, v7}, Ljava/util/Date;-><init>(J)V

    invoke-static {v2, v3}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣ۟ۧۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v3, 0xcdff

    :goto_10
    const v5, 0xce10

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_e

    goto :goto_10

    :goto_11
    :sswitch_29
    invoke-static {v4, v10, v2}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9, v8}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v3, 0xd106

    :goto_12
    const v4, 0xd117

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_f

    goto :goto_12

    :sswitch_2a
    const v3, 0xd125

    goto :goto_12

    :sswitch_2b
    const v3, 0xce1e

    goto :goto_10

    :sswitch_2c
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۦۥۣ۟()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {v2, v7, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-static {v2, v3}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣ۟ۧۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_11

    :sswitch_2d
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۦۥۦۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v17

    const v5, 0xd182

    :goto_13
    const v18, 0xd193

    xor-int v5, v5, v18

    sparse-switch v5, :sswitch_data_10

    goto :goto_13

    :sswitch_2e
    if-eqz v17, :cond_8

    const v5, 0xd1df

    goto :goto_13

    :cond_8
    :sswitch_2f
    const v5, 0xd1c0

    goto :goto_13

    :sswitch_30
    const v5, 0xd1fe

    :goto_14
    const v17, 0xd20f

    xor-int v5, v5, v17

    sparse-switch v5, :sswitch_data_11

    goto :goto_14

    :sswitch_31
    const v5, 0xd4a8

    goto :goto_14

    :sswitch_32
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۦۥۦۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :sswitch_33
    invoke-static {v6, v15, v2}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->ۦۢۢ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v6

    const v2, 0xd505

    :goto_15
    const v15, 0xd516

    xor-int/2addr v2, v15

    sparse-switch v2, :sswitch_data_12

    goto :goto_15

    :sswitch_34
    if-eqz v6, :cond_9

    const v2, 0xd562

    goto :goto_15

    :cond_9
    :sswitch_35
    const v2, 0xd543

    goto :goto_15

    :sswitch_36
    const v2, 0xd581

    :goto_16
    const v6, 0xd592

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_13

    goto :goto_16

    :sswitch_37
    const v2, 0xd5a0

    goto :goto_16

    :sswitch_38
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->ۦۢۢ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :sswitch_39
    invoke-static {v5, v14, v3}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->ۡۥۣۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v5

    const v2, 0xd888

    :goto_17
    const v6, 0xd899

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_14

    goto :goto_17

    :sswitch_3a
    if-eqz v5, :cond_a

    const v2, 0xd8e5

    goto :goto_17

    :cond_a
    :sswitch_3b
    const v2, 0xd8c6

    goto :goto_17

    :sswitch_3c
    const v2, 0xd904

    :goto_18
    const v5, 0xd915

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_15

    goto :goto_18

    :sswitch_3d
    const v2, 0xd923

    goto :goto_18

    :sswitch_3e
    move-object v2, v4

    :goto_19
    invoke-static {v3, v13, v2}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۥۣ۟ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xd980

    :goto_1a
    const v6, 0xd991

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_16

    goto :goto_1a

    :sswitch_3f
    if-eqz v3, :cond_b

    const v2, 0xdc68

    goto :goto_1a

    :sswitch_40
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->ۡۥۣۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_19

    :cond_b
    :sswitch_41
    const v2, 0xdc49

    goto :goto_1a

    :sswitch_42
    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v2

    invoke-static {v2, v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۧۢۨۦ(J)Ljava/lang/String;

    move-result-object v2

    const v3, 0xdc87

    :goto_1b
    const v6, 0xdc98

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_17

    goto :goto_1b

    :sswitch_43
    const v3, 0xdca6

    goto :goto_1b

    :sswitch_44
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۥۣ۟ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :sswitch_45
    invoke-static {v5, v12, v2}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->ۡۥۧۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v5

    const v2, 0xdd03

    :goto_1c
    const v6, 0xdd14

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_18

    goto :goto_1c

    :sswitch_46
    if-eqz v5, :cond_c

    const v2, 0x170090

    goto :goto_1c

    :cond_c
    :sswitch_47
    const v2, 0xdd41

    goto :goto_1c

    :sswitch_48
    const v2, 0x1700af

    :goto_1d
    const v5, 0x1700c0

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_19

    goto :goto_1d

    :goto_1e
    :sswitch_49
    invoke-static {v3, v11, v4}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۥۧۡۤ(Ljava/lang/Object;)J

    move-result-wide v12

    const v2, 0x1704ae

    :goto_1f
    const v3, 0x1704bf

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_1a

    goto :goto_1f

    :sswitch_4a
    const-wide/16 v2, 0x0

    cmp-long v2, v12, v2

    if-lez v2, :cond_e

    const v2, 0x17050b

    goto :goto_1f

    :sswitch_4b
    const v2, 0x1700ce

    goto :goto_1d

    :sswitch_4c
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->ۡۥۧۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/emoji2/ۢۧۡۧ;->ۤۥۨۢ(Ljava/lang/Object;)I

    move-result v4

    const v2, 0x17012b

    :goto_20
    const v5, 0x17013c

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_1b

    goto :goto_20

    :sswitch_4d
    const/16 v2, 0x14

    if-le v4, v2, :cond_d

    const v2, 0x170188

    goto :goto_20

    :cond_d
    :sswitch_4e
    const v2, 0x170169

    goto :goto_20

    :sswitch_4f
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->ۡۥۧۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    sget v5, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v5, v5, -0x1f7

    invoke-static {v2, v4, v5}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۦ۠ۡ۠(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v4, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v2, 0x1701a7

    :goto_21
    const v5, 0x1701b8

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_1c

    goto :goto_21

    :sswitch_50
    const v2, 0x170451

    goto :goto_21

    :sswitch_51
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->ۡۥۧۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_1e

    :cond_e
    :sswitch_52
    const v2, 0x1704ec

    goto :goto_1f

    :sswitch_53
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۦۥۣ۟()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {v2, v7, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v3, Ljava/util/Date;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۥۧۡۤ(Ljava/lang/Object;)J

    move-result-wide v6

    const-wide/16 v12, 0x3e8

    mul-long/2addr v6, v12

    invoke-direct {v3, v6, v7}, Ljava/util/Date;-><init>(J)V

    invoke-static {v2, v3}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣ۟ۧۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v3, 0x17052a

    :goto_22
    const v5, 0x17053b

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_1d

    goto :goto_22

    :sswitch_54
    const v3, 0x170549

    goto :goto_22

    :sswitch_55
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۦۥۣ۟()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {v2, v7, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-static {v2, v3}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣ۟ۧۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :sswitch_56
    invoke-static {v4, v10, v2}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9, v8}, Landroidx/loader/ۡۢۢ;->ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :sswitch_57
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v3

    const/16 v4, 0x31f

    sget v5, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v5, v5, 0x2f2

    const/16 v6, 0xa0f

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x32b

    const/4 v6, 0x1

    const/16 v7, 0x243

    invoke-static {v4, v5, v6, v7}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۢۧۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/emoji2/ۢۧۡۧ;->ۤۥۨۢ(Ljava/lang/Object;)I

    move-result v5

    const v3, 0x170831

    :goto_23
    const v6, 0x170842

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_1e

    goto :goto_23

    :cond_f
    :sswitch_58
    const v3, 0x17086f

    goto :goto_23

    :sswitch_59
    const/16 v3, 0x50

    if-le v5, v3, :cond_f

    const v3, 0x17088e

    goto :goto_23

    :sswitch_5a
    const/4 v3, 0x0

    sget v5, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v5, v5, 0x2b3

    invoke-static {v2, v3, v5}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۦ۠ۡ۠(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :sswitch_5b
    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->۟ۡۡۥۡ()Ljava/util/UUID;

    move-result-object v3

    invoke-static {v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۤۦۧۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    sget v6, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v6, v6, 0x6

    invoke-static {v3, v5, v6}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۦ۠ۡ۠(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v4, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p3

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_2d
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
        0xe -> :sswitch_9
        0x2d -> :sswitch_f
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_d
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
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_1f
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_20
        0x11 -> :sswitch_21
        0x2f -> :sswitch_24
        0x4c -> :sswitch_22
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_23
        0x7ab -> :sswitch_25
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_26
        0x36 -> :sswitch_27
        0x55 -> :sswitch_2c
        0x74 -> :sswitch_28
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_29
        0x3ef -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2a
        0x32 -> :sswitch_57
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_2e
        0x32 -> :sswitch_2f
        0x4c -> :sswitch_30
        0x53 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_31
        0x6a7 -> :sswitch_33
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_34
        0x32 -> :sswitch_35
        0x55 -> :sswitch_38
        0x74 -> :sswitch_36
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_37
        0x32 -> :sswitch_39
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3a
        0x3e -> :sswitch_3b
        0x5f -> :sswitch_40
        0x7c -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3d
        0x36 -> :sswitch_3e
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_3f
        0x5bb -> :sswitch_41
        0x5d8 -> :sswitch_44
        0x5f9 -> :sswitch_42
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_43
        0x3e -> :sswitch_45
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_46
        0x36 -> :sswitch_47
        0x55 -> :sswitch_4c
        0x17dd84 -> :sswitch_48
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_49
        0x6f -> :sswitch_4b
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x11 -> :sswitch_4a
        0x53 -> :sswitch_55
        0x72 -> :sswitch_52
        0x1b4 -> :sswitch_53
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x17 -> :sswitch_4d
        0x55 -> :sswitch_51
        0x76 -> :sswitch_4e
        0xb4 -> :sswitch_4f
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x1f -> :sswitch_50
        0x5e9 -> :sswitch_49
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_54
        0x72 -> :sswitch_56
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x12 -> :sswitch_58
        0x2d -> :sswitch_5b
        0x73 -> :sswitch_59
        0xcc -> :sswitch_5a
    .end sparse-switch
.end method

.method private generateSimpleFileName(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06df\u06e1\u06e4"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v9, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    const-string v1, "\u06e6\u06e8\u06e8"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_0
    aput-object p1, v2, v8

    const-string v1, "\u06e0\u06e1"

    move-object v7, v1

    goto :goto_0

    :sswitch_1
    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v7, "\u06e5\u06df\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0, v8}, Lkevin/fun/hook/download/DownloadManager;->ۣ۟۠۠ۢ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e5\u06e3\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v8, v10, 0x28a

    const-string v1, "\u06e5\u06e5\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_4
    sget v9, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    const-string v1, "\u06e0\u06e2\u06e7"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e5\u06e7\u06e6"

    move-object v7, v1

    goto :goto_0

    :sswitch_6
    aput-object v0, v2, v8

    const-string v1, "\u06e5\u06e5\u06e1"

    move-object v7, v1

    goto :goto_0

    :sswitch_7
    const/16 v1, 0x32c

    const/16 v3, 0x924

    invoke-static {v6, v1, v8, v3}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e8\u06e2\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_8
    xor-int/lit16 v8, v10, 0x359

    const-string v1, "\u06e1\u06e1\u06e5"

    move-object v7, v1

    goto :goto_0

    :sswitch_9
    xor-int/lit16 v8, v10, 0x262

    const-string v1, "\u06e5\u06e2\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_a
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const-string v7, "\u06e1\u06df\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_b
    sget v9, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    const-string v1, "\u06e3\u06e8\u06e5"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_c
    xor-int/lit8 v8, v10, -0x35

    const-string v1, "\u06e2\u06e0\u06e0"

    move-object v7, v1

    goto :goto_0

    :sswitch_d
    sget v9, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    const-string v1, "\u06e2\u06e2\u06e1"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_e
    invoke-static {v3, v2}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e3\u06e6\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_f
    sget v9, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    const-string v1, "\u06e6\u06df\u06e7"

    move-object v7, v1

    move v10, v9

    goto :goto_0

    :sswitch_10
    xor-int/lit8 v8, v10, -0x14

    const-string v1, "\u06df\u06e6\u06e0"

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_11
    aput-object v5, v2, v8

    const-string v1, "\u06e5\u06e3\u06e2"

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_12
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0x1aa742 -> :sswitch_5
        0x1aa7d9 -> :sswitch_0
        0x1aab25 -> :sswitch_10
        0x1aae85 -> :sswitch_f
        0x1aaec5 -> :sswitch_11
        0x1ab262 -> :sswitch_6
        0x1ab2a1 -> :sswitch_9
        0x1ab6dd -> :sswitch_12
        0x1ab720 -> :sswitch_8
        0x1abd8c -> :sswitch_4
        0x1abdeb -> :sswitch_2
        0x1abe01 -> :sswitch_a
        0x1abe04 -> :sswitch_e
        0x1abe41 -> :sswitch_b
        0x1abe43 -> :sswitch_7
        0x1abe84 -> :sswitch_d
        0x1ac14e -> :sswitch_3
        0x1ac266 -> :sswitch_c
        0x1ac92a -> :sswitch_1
    .end sparse-switch
.end method

.method private getFileExtension(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x33a

    sget v2, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v2, v2, -0x3c8

    const/16 v3, 0x5a3

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x33e

    sget v2, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v2, v2, -0x328

    const/16 v4, 0x84e

    invoke-static {v0, v1, v2, v4}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x343

    sget v4, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v4, v4, -0x1ba

    const/16 v5, 0x425

    invoke-static {v0, v1, v4, v5}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v4, 0x347

    sget v5, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v5, v5, -0x1ac

    const/16 v6, 0x4f0

    invoke-static {v0, v4, v5, v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x34b

    sget v6, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v6, v6, -0x18

    const/16 v7, 0x386

    invoke-static {v4, v5, v6, v7}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v5

    const/16 v6, 0x34f

    sget v7, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v7, v7, 0x297

    const/16 v8, 0x678

    invoke-static {v5, v6, v7, v8}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x650

    :goto_0
    xor-int/lit16 v6, v6, 0x661

    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v6, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p2, :cond_0

    const/16 v6, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x353

    sget v8, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v8, v8, -0x3be

    const/16 v9, 0x1aa

    invoke-static {v6, v7, v8, v9}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {p2, v6}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const/16 v6, 0x6cc

    :goto_1
    xor-int/lit16 v6, v6, 0x6dd

    sparse-switch v6, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v7, :cond_1

    const/16 v6, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v6, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x356

    sget v8, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v8, v8, -0xea

    const/16 v9, 0x4f9

    invoke-static {v6, v7, v8, v9}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {p2, v6}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const/16 v6, 0x748

    :goto_2
    xor-int/lit16 v6, v6, 0x759

    sparse-switch v6, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v7, :cond_2

    const v6, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v6, 0xbe41

    goto :goto_2

    :sswitch_8
    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    move-object v0, v5

    :goto_4
    :sswitch_a
    return-object v0

    :sswitch_b
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_c
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x35b

    sget v8, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v8, v8, 0x331

    const/16 v9, 0xc49

    invoke-static {v6, v7, v8, v9}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {p2, v6}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v6, 0xbefb

    :goto_5
    const v8, 0xbf0c

    xor-int/2addr v6, v8

    sparse-switch v6, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_d
    const v6, 0xbf39

    goto :goto_5

    :sswitch_e
    if-nez v7, :cond_3

    const v6, 0xc1e3

    goto :goto_5

    :sswitch_f
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x35f

    sget v8, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v8, v8, -0x10c

    const/16 v9, 0x1cd

    invoke-static {v6, v7, v8, v9}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {p2, v6}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v6, 0xc202

    :goto_6
    const v8, 0xc213

    xor-int/2addr v6, v8

    sparse-switch v6, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    if-eqz v7, :cond_4

    const v6, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_11
    const v6, 0xc240

    goto :goto_6

    :sswitch_12
    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_13
    move-object v0, v4

    goto :goto_4

    :sswitch_14
    const v0, 0xc29d

    goto :goto_7

    :sswitch_15
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x362

    sget v8, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v8, v8, 0x8f

    const/16 v9, 0xafc

    invoke-static {v6, v7, v8, v9}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {p2, v6}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v6, 0xc2fa

    :goto_8
    const v8, 0xc30b

    xor-int/2addr v6, v8

    sparse-switch v6, :sswitch_data_7

    goto :goto_8

    :sswitch_16
    if-eqz v7, :cond_5

    const v6, 0xc5e2

    goto :goto_8

    :cond_5
    :sswitch_17
    const v6, 0xc5c3

    goto :goto_8

    :sswitch_18
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x365

    sget v8, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v8, v8, 0xf0

    const/16 v9, 0x19a

    invoke-static {v6, v7, v8, v9}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {p2, v6}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v6, 0xc601

    :goto_9
    const v8, 0xc612

    xor-int/2addr v6, v8

    sparse-switch v6, :sswitch_data_8

    goto :goto_9

    :sswitch_19
    if-eqz v7, :cond_6

    const v6, 0xc65e

    goto :goto_9

    :cond_6
    :sswitch_1a
    const v6, 0xc63f

    goto :goto_9

    :sswitch_1b
    move-object v0, v1

    goto/16 :goto_4

    :sswitch_1c
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x368

    sget v8, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v8, v8, 0xc7

    const/16 v9, 0x171

    invoke-static {v6, v7, v8, v9}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {p2, v6}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v6, 0xc67d

    :goto_a
    const v8, 0xc68e

    xor-int/2addr v6, v8

    sparse-switch v6, :sswitch_data_9

    goto :goto_a

    :cond_7
    :sswitch_1d
    const v6, 0xc6bb

    goto :goto_a

    :sswitch_1e
    if-eqz v7, :cond_7

    const v6, 0xc965

    goto :goto_a

    :sswitch_1f
    move-object v0, v2

    goto/16 :goto_4

    :sswitch_20
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x36c

    sget v8, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v8, v8, 0x336

    const/16 v9, 0x487

    invoke-static {v6, v7, v8, v9}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {p2, v6}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v6, 0xc984

    :goto_b
    const v8, 0xc995

    xor-int/2addr v6, v8

    sparse-switch v6, :sswitch_data_a

    goto :goto_b

    :sswitch_21
    if-nez v7, :cond_8

    const v6, 0xc9e1

    goto :goto_b

    :cond_8
    :sswitch_22
    const v6, 0xc9c2

    goto :goto_b

    :sswitch_23
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x36f

    sget v8, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v8, v8, 0x123

    const/16 v9, 0x523

    invoke-static {v6, v7, v8, v9}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {p2, v6}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v6, 0xca00

    :goto_c
    const v8, 0xca11

    xor-int/2addr v6, v8

    sparse-switch v6, :sswitch_data_b

    goto :goto_c

    :cond_9
    :sswitch_24
    const v6, 0xca3e

    goto :goto_c

    :sswitch_25
    if-eqz v7, :cond_9

    const v6, 0xca5d

    goto :goto_c

    :sswitch_26
    move-object v0, v3

    goto/16 :goto_4

    :sswitch_27
    const v6, 0xca7c

    :goto_d
    const v7, 0xca8d

    xor-int/2addr v6, v7

    sparse-switch v6, :sswitch_data_c

    goto :goto_d

    :sswitch_28
    if-eqz p1, :cond_a

    const v6, 0xcd64

    goto :goto_d

    :cond_a
    :sswitch_29
    const v6, 0xcd45

    goto :goto_d

    :sswitch_2a
    invoke-static {p1}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۨۡۥۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v5}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    const v6, 0xcd83

    :goto_e
    const v9, 0xcd94

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_d

    goto :goto_e

    :sswitch_2b
    if-eqz v8, :cond_b

    const v6, 0xcde0

    goto :goto_e

    :cond_b
    :sswitch_2c
    const v6, 0xcdc1

    goto :goto_e

    :sswitch_2d
    move-object v0, v5

    goto/16 :goto_4

    :sswitch_2e
    invoke-static {v7, v4}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const v5, 0xcdff

    :goto_f
    const v8, 0xce10

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_e

    goto :goto_f

    :cond_c
    :sswitch_2f
    const v5, 0xce3d

    goto :goto_f

    :sswitch_30
    if-nez v6, :cond_c

    const v5, 0xd0e7

    goto :goto_f

    :sswitch_31
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v5

    const/16 v6, 0x374

    sget v8, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v8, v8, 0x57

    const/16 v9, 0x638

    invoke-static {v5, v6, v8, v9}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const v5, 0xd106

    :goto_10
    const v8, 0xd117

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_f

    goto :goto_10

    :sswitch_32
    if-eqz v6, :cond_d

    const v5, 0xd163

    goto :goto_10

    :cond_d
    :sswitch_33
    const v5, 0xd144

    goto :goto_10

    :sswitch_34
    const v0, 0xd182

    :goto_11
    const v1, 0xd193

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_10

    goto :goto_11

    :sswitch_35
    const v0, 0xd1a1

    goto :goto_11

    :sswitch_36
    invoke-static {v7, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v4, 0xd1fe

    :goto_12
    const v6, 0xd20f

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_11

    goto :goto_12

    :sswitch_37
    if-eqz v5, :cond_e

    const v4, 0xd4e6

    goto :goto_12

    :cond_e
    :sswitch_38
    const v4, 0xd4c7

    goto :goto_12

    :sswitch_39
    invoke-static {v7, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const v0, 0xd505

    :goto_13
    const v5, 0xd516

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_12

    goto :goto_13

    :sswitch_3a
    if-eqz v4, :cond_f

    const v0, 0xd562

    goto :goto_13

    :cond_f
    :sswitch_3b
    const v0, 0xd543

    goto :goto_13

    :sswitch_3c
    move-object v0, v1

    goto/16 :goto_4

    :sswitch_3d
    invoke-static {v7, v2}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xd581

    :goto_14
    const v4, 0xd592

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_13

    goto :goto_14

    :sswitch_3e
    if-eqz v1, :cond_10

    const v0, 0xd869

    goto :goto_14

    :cond_10
    :sswitch_3f
    const v0, 0xd5bf

    goto :goto_14

    :sswitch_40
    move-object v0, v2

    goto/16 :goto_4

    :sswitch_41
    invoke-static {v7, v3}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xd888

    :goto_15
    const v2, 0xd899

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_14

    goto :goto_15

    :sswitch_42
    if-eqz v1, :cond_11

    const v0, 0xd8e5

    goto :goto_15

    :cond_11
    :sswitch_43
    const v0, 0xd8c6

    goto :goto_15

    :sswitch_44
    move-object v0, v3

    goto/16 :goto_4

    :sswitch_45
    move-object v0, v4

    goto/16 :goto_4

    :sswitch_46
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x379

    sget v2, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v2, v2, -0xe9

    const/16 v3, 0x97f

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

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
        0x1d7 -> :sswitch_9
        0x1f4 -> :sswitch_5
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
        0x16 -> :sswitch_d
        0x35 -> :sswitch_13
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_18
        0x6e9 -> :sswitch_a
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x2d -> :sswitch_1c
        0x32 -> :sswitch_1a
        0x4c -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1d
        0x35 -> :sswitch_20
        0xf3 -> :sswitch_1e
        0xfeb -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_21
        0x36 -> :sswitch_22
        0x57 -> :sswitch_26
        0x74 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_24
        0x11 -> :sswitch_25
        0x2f -> :sswitch_27
        0x4c -> :sswitch_26
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_28
        0x7ab -> :sswitch_29
        0x7c8 -> :sswitch_46
        0x7e9 -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_2b
        0x36 -> :sswitch_2c
        0x55 -> :sswitch_2e
        0x74 -> :sswitch_2d
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2f
        0x2d -> :sswitch_45
        0x3ef -> :sswitch_30
        0x1ef7 -> :sswitch_31
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_32
        0x32 -> :sswitch_33
        0x53 -> :sswitch_36
        0x74 -> :sswitch_34
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_35
        0x32 -> :sswitch_45
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_37
        0x6a7 -> :sswitch_38
        0x6c8 -> :sswitch_39
        0x6e9 -> :sswitch_a
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_3a
        0x32 -> :sswitch_3b
        0x55 -> :sswitch_3d
        0x74 -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_3e
        0x2d -> :sswitch_41
        0x32 -> :sswitch_3f
        0xdfb -> :sswitch_40
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_42
        0x3e -> :sswitch_43
        0x5f -> :sswitch_46
        0x7c -> :sswitch_44
    .end sparse-switch
.end method

.method public static getInstance()Lkevin/fun/hook/download/DownloadManager;
    .locals 3

    const-class v1, Lkevin/fun/hook/download/DownloadManager;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۤۡۧ()Lkevin/fun/hook/download/DownloadManager;

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

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v0, Lkevin/fun/hook/download/DownloadManager;

    invoke-direct {v0}, Lkevin/fun/hook/download/DownloadManager;-><init>()V

    sput-object v0, Lkevin/fun/hook/download/DownloadManager;->instance:Lkevin/fun/hook/download/DownloadManager;

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۤۡۧ()Lkevin/fun/hook/download/DownloadManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method private getRandomString(I)Ljava/lang/String;
    .locals 5

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x37d

    sget v2, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v2, v2, -0x19a

    const/16 v3, 0xb9d

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v4, Ljava/util/Random;

    invoke-direct {v4}, Ljava/util/Random;-><init>()V

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
    if-lt v0, p1, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_3
    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_4
    invoke-static {v2}, Landroidx/emoji2/ۢۧۡۧ;->ۤۥۨۢ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v4, v1}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۡ۠(Ljava/lang/Object;I)I

    move-result v1

    invoke-static {v2, v1}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۤۤ۠۟(Ljava/lang/Object;I)C

    move-result v1

    invoke-static {v3, v1}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۣۧۡۥ(Ljava/lang/Object;C)Ljava/lang/StringBuilder;

    sget v1, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v1, v1, -0x1e7

    add-int/2addr v0, v1

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
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_0
    .end sparse-switch
.end method

.method private getTimestamp()Ljava/lang/String;
    .locals 10

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e8\u06e7\u06e8"

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

    const/16 v1, 0x3a1

    const/16 v5, 0x497

    invoke-static {v0, v1, v7, v5}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06df\u06e3\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v4, v3}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣ۟ۧۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e4\u06e4\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e7\u06e7\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۦۥۣ۟()Ljava/util/Locale;

    move-result-object v1

    const-string v6, "\u06e6\u06e8\u06e1"

    move-object v2, v1

    goto :goto_0

    :sswitch_3
    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-direct {v1, v5, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v6, "\u06df\u06e7\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    const-string v6, "\u06e0\u06e6\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v7, v9, 0x111

    const-string v1, "\u06e0\u06e7\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    sget v8, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    const-string v1, "\u06e6\u06e4\u06e1"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_7
    return-object v5

    :sswitch_data_0
    .sparse-switch
        0x1aa77f -> :sswitch_2
        0x1aa7fc -> :sswitch_4
        0x1aab9b -> :sswitch_0
        0x1aba62 -> :sswitch_7
        0x1ac1e3 -> :sswitch_5
        0x1ac25f -> :sswitch_3
        0x1ac607 -> :sswitch_6
        0x1ac9c9 -> :sswitch_1
    .end sparse-switch
.end method

.method private initNotificationChannel(Landroid/content/Context;)V
    .locals 7

    const/4 v6, 0x0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۨ۠()Landroid/app/NotificationManager;

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
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x3b0

    sget v2, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v2, v2, 0x222

    const/16 v3, 0xb7e

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/customview/ۡۤۡۤ;->ۢۨ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    sput-object v0, Lkevin/fun/hook/download/DownloadManager;->notificationManager:Landroid/app/NotificationManager;

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۨ۠()Landroid/app/NotificationManager;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x3bc

    sget v3, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v3, v3, 0x149

    const/16 v4, 0x4da

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/customview/ۡۤۡۤ;->ۥۨۨۥ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/app/NotificationChannel;

    move-result-object v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-nez v2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    new-instance v0, Landroid/app/NotificationChannel;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x3d2

    sget v4, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v4, v4, 0xc6

    const/16 v5, 0xbae

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v2

    sget v3, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v3, v3, 0x359

    invoke-direct {v0, v1, v2, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x3d7

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v3, v3, -0x7d

    const/16 v4, 0x73c

    invoke-static {v1, v2, v3, v4}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/ۤۦ۟ۢ;->ۧۧ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v6, v6}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟ۡۢۤۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/loader/ۢۥ۟;->۟۠ۥۢۤ(Ljava/lang/Object;Z)V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۨ۠()Landroid/app/NotificationManager;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۨۤۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V

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

.method static synthetic lambda$14(Landroid/app/Dialog;[Landroid/widget/ProgressBar;I[Landroid/widget/TextView;[Landroid/widget/TextView;JJJ)V
    .locals 9

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
    if-eqz p0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۤۥۣۡ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v2, 0xbe22

    goto :goto_2

    :sswitch_7
    const/4 v2, 0x0

    aget-object v3, p1, v2

    const v2, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v2, 0xbebd

    goto :goto_3

    :sswitch_9
    if-eqz v3, :cond_2

    const v2, 0xbedc

    goto :goto_3

    :sswitch_a
    const/4 v2, 0x0

    aget-object v2, p1, v2

    invoke-static {v2, p2}, Landroidx/loader/ۣ۟۟ۧ۠;->ۤۥۨۨ(Ljava/lang/Object;I)V

    :sswitch_b
    const/4 v2, 0x0

    aget-object v3, p3, v2

    const v2, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_c
    const v2, 0xbf39

    goto :goto_4

    :sswitch_d
    if-eqz v3, :cond_3

    const v2, 0xc1e3

    goto :goto_4

    :sswitch_e
    const/4 v2, 0x0

    aget-object v2, p3, v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3, p2}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x3dd

    const/4 v6, 0x1

    const/16 v7, 0x8b4

    invoke-static {v4, v5, v6, v7}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_f
    const/4 v2, 0x0

    aget-object v3, p4, v2

    const v2, 0xc202

    :goto_5
    const v4, 0xc213

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_5

    goto :goto_5

    :sswitch_10
    if-eqz v3, :cond_4

    const v2, 0xc25f

    goto :goto_5

    :cond_4
    :sswitch_11
    const v2, 0xc240

    goto :goto_5

    :sswitch_12
    const v2, 0xc27e

    :goto_6
    const v3, 0xc28f

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_6

    goto :goto_6

    :cond_5
    :sswitch_13
    const v2, 0xc2bc

    goto :goto_6

    :sswitch_14
    const-wide/16 v2, 0x0

    cmp-long v2, p5, v2

    if-lez v2, :cond_5

    const v2, 0xc2db

    goto :goto_6

    :sswitch_15
    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v2

    sub-long v4, v2, p7

    const v2, 0xc2fa

    :goto_7
    const v3, 0xc30b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_7

    goto :goto_7

    :sswitch_16
    const-wide/16 v2, 0x0

    cmp-long v2, v4, v2

    if-lez v2, :cond_6

    const v2, 0xc5e2

    goto :goto_7

    :cond_6
    :sswitch_17
    const v2, 0xc5c3

    goto :goto_7

    :sswitch_18
    move-wide/from16 v0, p9

    long-to-double v6, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v2, v6

    long-to-double v4, v4

    div-double v4, v2, v4

    const v2, 0xc601

    :goto_8
    const v3, 0xc612

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_8

    goto :goto_8

    :sswitch_19
    const-wide/high16 v2, 0x4130000000000000L    # 1048576.0

    cmpl-double v2, v4, v2

    if-lez v2, :cond_7

    const v2, 0xc65e

    goto :goto_8

    :cond_7
    :sswitch_1a
    const v2, 0xc63f

    goto :goto_8

    :sswitch_1b
    const-wide/high16 v2, 0x4130000000000000L    # 1048576.0

    div-double v2, v4, v2

    invoke-static {v2, v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟۟ۧۢۡ(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v4, v4, -0xed

    aput-object v2, v3, v4

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v4, 0x3de

    sget v5, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v5, v5, 0x85

    const/16 v8, 0x30f

    invoke-static {v2, v4, v5, v8}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v3, 0xc67d

    :goto_9
    const v4, 0xc68e

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_9

    goto :goto_9

    :goto_a
    :pswitch_0
    :sswitch_1c
    const-wide/high16 v4, 0x4130000000000000L    # 1048576.0

    div-double v4, v6, v4

    invoke-static {v4, v5}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟۟ۧۢۡ(D)Ljava/lang/Double;

    move-result-object v3

    long-to-double v4, p5

    const-wide/high16 v6, 0x4130000000000000L    # 1048576.0

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟۟ۧۢۡ(D)Ljava/lang/Double;

    move-result-object v4

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    sget v6, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v6, v6, -0x3c7

    aput-object v3, v5, v6

    sget v3, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v3, v3, 0xf2

    aput-object v4, v5, v3

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v3

    const/16 v4, 0x3f8

    sget v6, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v6, v6, -0x261

    const/16 v7, 0x697

    invoke-static {v3, v4, v6, v7}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aget-object v4, p4, v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v5

    const/16 v6, 0x407

    sget v7, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v7, v7, -0x1e5

    const/16 v8, 0x260

    invoke-static {v5, v6, v7, v8}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_b
    :sswitch_1d
    return-void

    :sswitch_1e
    const v3, 0xc69c

    goto :goto_9

    :sswitch_1f
    const v2, 0xc984

    :goto_c
    const v3, 0xc995

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_a

    goto :goto_c

    :sswitch_20
    const-wide/high16 v2, 0x4090000000000000L    # 1024.0

    cmpl-double v2, v4, v2

    if-lez v2, :cond_8

    const v2, 0xc9e1

    goto :goto_c

    :cond_8
    :sswitch_21
    const v2, 0xc9c2

    goto :goto_c

    :sswitch_22
    const-wide/high16 v2, 0x4090000000000000L    # 1024.0

    div-double v2, v4, v2

    invoke-static {v2, v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟۟ۧۢۡ(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v4, v4, 0x20e

    aput-object v2, v3, v4

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v4, 0x3e7

    sget v5, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v5, v5, 0x26e

    const/16 v8, 0x8d7

    invoke-static {v2, v4, v5, v8}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v3, 0xca00

    :goto_d
    const v4, 0xca11

    xor-int/2addr v3, v4

    packed-switch v3, :pswitch_data_0

    :pswitch_1
    goto :goto_d

    :pswitch_2
    const v3, 0xca1f

    goto :goto_d

    :sswitch_23
    invoke-static {v4, v5}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟۟ۧۢۡ(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v4, v4, -0x16b

    aput-object v2, v3, v4

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v4, 0x3f0

    sget v5, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v5, v5, 0x41

    const/16 v8, 0xad2

    invoke-static {v2, v4, v5, v8}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_a

    :sswitch_24
    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

    move-result v3

    const v2, 0xca7c

    :goto_e
    const v4, 0xca8d

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_b

    goto :goto_e

    :sswitch_25
    if-ltz v3, :cond_9

    const v2, 0xcd64

    goto :goto_e

    :cond_9
    :sswitch_26
    const v2, 0xcd45

    goto :goto_e

    :sswitch_27
    const-string v2, "wGTlUgdm3wOoqstw"

    invoke-static {v2}, Landroidx/loader/ۥۧۨۤ;->ۣۣ۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(I)V

    goto/16 :goto_b

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_24
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
        0xb97b -> :sswitch_24
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
        0x16 -> :sswitch_c
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_1d
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_1d
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x2d -> :sswitch_1f
        0x32 -> :sswitch_1a
        0x4c -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1c
        0xf3 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_20
        0x36 -> :sswitch_21
        0x57 -> :sswitch_23
        0x74 -> :sswitch_22
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
        0xf1 -> :sswitch_25
        0x7ab -> :sswitch_26
        0x7c8 -> :sswitch_1d
        0x7e9 -> :sswitch_27
    .end sparse-switch
.end method

.method static synthetic lambda$16()V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۨ۠()Landroid/app/NotificationManager;

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
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۨ۠()Landroid/app/NotificationManager;

    move-result-object v0

    sget v1, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v1, v1, 0x279d

    invoke-static {v0, v1}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۥۣۤۨ(Ljava/lang/Object;I)V

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

.method static synthetic lambda$7([Landroid/app/Dialog;)V
    .locals 3

    const/4 v2, 0x0

    aget-object v1, p0, v2

    const/16 v0, 0x650

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
    aget-object v0, p0, v2

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۤۥۣۡ(Ljava/lang/Object;)Z

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
    aget-object v0, p0, v2

    invoke-static {v0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    :sswitch_6
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
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method private showBatchProgressDialog(Landroid/content/Context;ILjava/lang/String;)V
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06df\u06e4\u06e3"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۦۡۦۧ()Landroid/os/Handler;

    move-result-object v1

    const-string v3, "\u06e2\u06e8\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    new-instance v0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda6;

    invoke-direct {v0, p0, p1, p2, p3}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda6;-><init>(Lkevin/fun/hook/download/DownloadManager;Landroid/content/Context;ILjava/lang/String;)V

    const-string v1, "\u06df\u06df\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v2, v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v1, "\u06df\u06e8\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa703 -> :sswitch_1
        0x1aa816 -> :sswitch_2
        0x1ab362 -> :sswitch_0
    .end sparse-switch
.end method

.method private showCustomToast(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 8

    const/high16 v5, 0x41a00000    # 20.0f

    const/high16 v6, 0x41400000    # 12.0f

    const/4 v7, 0x0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v0, Landroid/widget/Toast;

    invoke-direct {v0, p1}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v7}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡۤۥ(Ljava/lang/Object;I)V

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-static {v1, v7}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v2, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v2, v2, -0x74

    invoke-static {v1, v2}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    invoke-static {p0, p1, v5}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v3

    invoke-static {p0, p1, v6}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v4

    invoke-static {p0, p1, v5}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v5

    invoke-static {p0, p1, v6}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v6

    invoke-static {v1, v3, v4, v5, v6}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v3, p3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const/high16 v4, 0x41c80000    # 25.0f

    invoke-static {p0, p1, v4}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v4

    int-to-float v4, v4

    invoke-static {v3, v4}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v1, v3}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v3, p2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v4, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v4, v4, -0x167

    invoke-static {v3, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/high16 v4, 0x41600000    # 14.0f

    invoke-static {v3, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Landroidx/core/ۧ۟ۤۨ;->۟ۧۧۥ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v2, v7, v7}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣۧ۟ۢ(Ljava/lang/Object;III)V

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۠۠ۥۣ(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_3
        0xef -> :sswitch_2
    .end sparse-switch
.end method

.method private showDownloadCompleteNotification(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 6

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۨ۠()Landroid/app/NotificationManager;

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
    invoke-static {p0, p1}, Lkevin/fun/hook/download/DownloadManager;->ۡۦ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3
    new-instance v2, Landroidx/core/app/NotificationCompat$Builder;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x40a

    sget v3, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v3, v3, 0x309

    const/16 v4, 0x9cd

    invoke-static {v0, v1, v3, v4}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, p1, v0}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz p3, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const v0, 0x1080082

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    const v1, 0xbe22

    goto :goto_2

    :sswitch_8
    const v0, 0x1080078

    :sswitch_9
    invoke-static {v2, v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣۣ۟۟ۡ(Ljava/lang/Object;I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v2

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_a
    const v0, 0xbebd

    goto :goto_3

    :sswitch_b
    if-eqz p3, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_c
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x420

    sget v3, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v3, v3, -0x10d

    const/16 v4, 0x2f3

    invoke-static {v0, v1, v3, v4}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v0

    const v1, 0xbefb

    :goto_4
    const v3, 0xbf0c

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_d
    invoke-static {v2, v0}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۥۣۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-static {v0, p2}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣۢۥۣ(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۣ۠ۧ(Ljava/lang/Object;Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۧۨۢ(Ljava/lang/Object;I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۨ۠()Landroid/app/NotificationManager;

    move-result-object v1

    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۢ۟(Ljava/lang/Object;)Landroid/app/Notification;

    move-result-object v0

    sget v2, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v2, v2, 0x240e

    invoke-static {v1, v2, v0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟ۥۥۨۢ(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۦۡۦۧ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda1;

    invoke-direct {v1}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda1;-><init>()V

    const-wide/16 v2, -0x9a8

    sget v4, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    int-to-long v4, v4

    xor-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/۟۠ۢۧۡ;->ۣۤۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z

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
    const v1, 0xbf1a

    goto :goto_4

    :sswitch_10
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x424

    sget v3, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v3, v3, -0x16f

    const/16 v4, 0x466

    invoke-static {v0, v1, v3, v4}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    goto :goto_5

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x428

    sget v4, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v4, v4, -0x7f

    const/16 v5, 0x21f

    invoke-static {v2, v3, v4, v5}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/download/DownloadManager;->ۡۨ۟(Ljava/lang/Object;)V

    :sswitch_11
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
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
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
    .end sparse-switch
.end method

.method private showDownloadProgressNotification(Landroid/content/Context;Ljava/lang/String;IJJ)V
    .locals 6

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۨ۠()Landroid/app/NotificationManager;

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
    invoke-static {p0, p1}, Lkevin/fun/hook/download/DownloadManager;->ۡۦ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۧۥۦ()Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const/4 v1, 0x0

    const v2, 0xc00015f

    sget v3, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/2addr v2, v3

    invoke-static {p1, v1, v0, v2}, Landroidx/viewpager/ۣۢ۟ۤ;->ۡۤۨ۟(Ljava/lang/Object;ILjava/lang/Object;I)Landroid/app/PendingIntent;

    move-result-object v0

    new-instance v1, Landroidx/core/app/NotificationCompat$Builder;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x443

    sget v4, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v4, v4, -0x20a

    const/16 v5, 0x8c0

    invoke-static {v2, v3, v4, v5}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const v2, -0x108018a

    sget v3, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/2addr v2, v3

    invoke-static {v1, v2}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣۣ۟۟ۡ(Ljava/lang/Object;I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x459

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v4, v4, -0x3a2

    const/16 v5, 0x234

    invoke-static {v2, v3, v4, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۥۣۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    invoke-static {v1, p2}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣۢۥۣ(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۧۥۣۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟۟ۨ۠ۢ(Ljava/lang/Object;Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v1, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v1, v1, 0x3be

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۧۨۢ(Ljava/lang/Object;I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣۡ۠ۢ(Ljava/lang/Object;Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x45d

    sget v3, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v3, v3, -0x1f0

    const/16 v4, 0x4f9

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣۣ۟ۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/download/DownloadManager;->notificationBuilder:Landroidx/core/app/NotificationCompat$Builder;

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۧۥۦ()Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v1, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v1, v1, 0x17a

    const/4 v2, 0x0

    invoke-static {v0, v1, p3, v2}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟ۧۨۢ(Ljava/lang/Object;IIZ)Landroidx/core/app/NotificationCompat$Builder;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۧۥۦ()Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x465

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v3, v3, 0x284

    const/16 v4, 0xb0f

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p3}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v4, v4, 0x253

    aput-object p2, v3, v4

    sget v4, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v4, v4, -0x1bd

    aput-object v2, v3, v4

    invoke-static {v1, v3}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣۢۥۣ(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/core/app/NotificationCompat$Builder;

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_8
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-lez v0, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_2

    :sswitch_a
    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_b
    const v0, 0xbebd

    goto :goto_3

    :sswitch_c
    const-wide/16 v0, 0x0

    cmp-long v0, p6, v0

    if-lez v0, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_d
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x46e

    sget v2, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v2, v2, -0x76

    const/16 v3, 0x9ba

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v0

    long-to-double v2, p4

    const-wide/high16 v4, 0x4130000000000000L    # 1048576.0

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟۟ۧۢۡ(D)Ljava/lang/Double;

    move-result-object v1

    long-to-double v2, p6

    const-wide/high16 v4, 0x4130000000000000L    # 1048576.0

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟۟ۧۢۡ(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v4, v4, 0xf3

    aput-object v1, v3, v4

    sget v1, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v1, v1, 0x383

    aput-object v2, v3, v1

    invoke-static {v0, v3}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۧۥۦ()Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/activity/ۤۧۧۧ;->ۡۦۣ۠(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/core/app/NotificationCompat$Builder;

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۨ۠()Landroid/app/NotificationManager;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۧۥۦ()Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    invoke-static {v1}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۢ۟(Ljava/lang/Object;)Landroid/app/Notification;

    move-result-object v1

    sget v2, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v2, v2, 0x259c

    invoke-static {v0, v2, v1}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟ۥۥۨۢ(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v0, 0xbefb

    :goto_4
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_f
    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

    move-result v1

    const v0, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    if-ltz v1, :cond_4

    const v0, 0xc25f

    goto :goto_6

    :sswitch_11
    const v0, 0xbf1a

    goto :goto_4

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x47d

    sget v4, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v4, v4, -0x174

    const/16 v5, 0x40e

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/download/DownloadManager;->ۡۨ۟(Ljava/lang/Object;)V

    goto :goto_5

    :cond_4
    :sswitch_12
    const v0, 0xc240

    goto :goto_6

    :sswitch_13
    const-string v0, "qMdBntlSV9e19bRaDUxJG3L0uP6Gq"

    invoke-static {v0}, Landroidx/interpolator/ۦۨۢۦ;->ۣۢۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_14
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
        0x2d -> :sswitch_e
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_f
        0x1f7 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_12
        0x4c -> :sswitch_13
        0x53 -> :sswitch_14
    .end sparse-switch
.end method

.method private showErrorToast(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const v0, -0xbbdd8

    sget v1, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/2addr v0, v1

    invoke-static {p0, p1, p2, v0}, Lkevin/fun/hook/download/DownloadManager;->ۦۦ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "4Xj5ZTpIln4bXeIulyLOB7wI06J"

    invoke-static {v0}, Landroidx/core/ۤۦ۟ۢ;->ۣ۟۟ۧۧ(Ljava/lang/String;)Ljava/lang/String;

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

.method private showSuccessToast(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    const/4 v2, 0x0

    const-string v0, "\u06e3\u06e3\u06e7"

    move v1, v2

    move v3, v2

    :goto_0
    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    return-void

    :sswitch_0
    const v0, 0xb35043

    xor-int v2, v0, v1

    const-string v0, "\u06e6\u06e0\u06e7"

    move v3, v2

    goto :goto_0

    :sswitch_1
    invoke-static {p0, p1, p2, v3}, Lkevin/fun/hook/download/DownloadManager;->ۦۦ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string v0, "\u06e5\u06e7"

    goto :goto_0

    :sswitch_2
    sget v1, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    const-string v0, "\u06e0\u06e7\u06e5"

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aabbe -> :sswitch_0
        0x1ab687 -> :sswitch_2
        0x1ac16d -> :sswitch_1
    .end sparse-switch
.end method

.method private startDownload(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->۟ۥ۠ۧۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

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
    const-string v0, "9HxB"

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۣۣ۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

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

.method private startDownload(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 35

    new-instance v4, Ljava/lang/ref/WeakReference;

    move-object/from16 v0, p1

    invoke-direct {v4, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const/4 v2, 0x1

    new-array v5, v2, [Landroid/app/Dialog;

    const/4 v2, 0x1

    new-array v13, v2, [Landroid/widget/TextView;

    const/4 v2, 0x1

    new-array v14, v2, [Landroid/widget/ProgressBar;

    const/4 v2, 0x1

    new-array v15, v2, [Landroid/widget/TextView;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v32

    const/4 v2, 0x1

    new-array v9, v2, [Z

    const/4 v2, 0x1

    new-array v10, v2, [Lokhttp3/Call;

    const/4 v2, 0x1

    new-array v11, v2, [Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v8, v2, [Z

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
    if-eqz p7, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۦۡۦۧ()Landroid/os/Handler;

    move-result-object v16

    new-instance v2, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;

    move-object/from16 v3, p0

    move-object/from16 v6, p6

    move-object/from16 v7, p4

    move-object/from16 v12, p1

    invoke-direct/range {v2 .. v15}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;-><init>(Lkevin/fun/hook/download/DownloadManager;Ljava/lang/ref/WeakReference;[Landroid/app/Dialog;Ljava/lang/String;Ljava/lang/String;[Z[Z[Lokhttp3/Call;[Landroid/net/Uri;Landroid/content/Context;[Landroid/widget/TextView;[Landroid/widget/ProgressBar;[Landroid/widget/TextView;)V

    move-object/from16 v0, v16

    invoke-static {v0, v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۥۣ۟()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    new-instance v17, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;

    move-object/from16 v18, p0

    move-object/from16 v19, v9

    move-object/from16 v20, p4

    move-object/from16 v21, p2

    move-object/from16 v22, p3

    move-object/from16 v23, p1

    move-object/from16 v24, v11

    move-object/from16 v25, v10

    move/from16 v26, p7

    move-object/from16 v27, v8

    move-object/from16 v28, v5

    move-object/from16 v29, v13

    move-object/from16 v30, v14

    move-object/from16 v31, v15

    move-object/from16 v34, p6

    invoke-direct/range {v17 .. v34}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;-><init>(Lkevin/fun/hook/download/DownloadManager;[ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;[Landroid/net/Uri;[Lokhttp3/Call;Z[Z[Landroid/app/Dialog;[Landroid/widget/TextView;[Landroid/widget/ProgressBar;[Landroid/widget/TextView;JLjava/lang/String;)V

    move-object/from16 v0, v17

    invoke-static {v2, v0}, Landroidx/activity/ۣۦۡۥ;->۟ۢ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method private synthesizeAndSaveLivePhoto(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static/range {p1 .. p1}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۧ۠ۥۨ(Ljava/lang/Object;)Ljava/io/File;

    move-result-object v2

    invoke-static {v2}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۡۢ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v3

    const/16 v4, 0x496

    sget v5, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v5, v5, 0x29c

    const/16 v6, 0x70d

    invoke-static {v3, v4, v5, v6}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

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
    if-nez v4, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v3}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۧۤۢۦ(Ljava/lang/Object;)Z

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
    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v2, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v6, 0x4a7

    sget v7, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v7, v7, -0x1a

    const/16 v8, 0x218

    invoke-static {v4, v6, v7, v8}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_8
    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v2

    sget v4, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v4, v4, 0x77

    invoke-static {p0, v4}, Lkevin/fun/hook/download/DownloadManager;->ۣ۟۠۠ۢ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v7, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v8

    const/16 v9, 0x4b1

    sget v10, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v10, v10, -0x1b7

    const/16 v11, 0x1f5

    invoke-static {v8, v9, v10, v11}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {v7, v2, v3}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v3

    const/16 v7, 0x4bc

    const/4 v8, 0x1

    const/16 v9, 0xc83

    invoke-static {v3, v7, v8, v9}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x4bd

    sget v8, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v8, v8, -0x26c

    const/16 v9, 0x71b

    invoke-static {v6, v7, v8, v9}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v8

    invoke-static {p0, v4}, Lkevin/fun/hook/download/DownloadManager;->ۣ۟۠۠ۢ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v2

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v10, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v11

    const/16 v12, 0x4c1

    sget v13, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v13, v13, 0x298

    const/16 v14, 0xbf0

    invoke-static {v11, v12, v13, v14}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-static {v10, v8, v9}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-static {v8, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-static {v8, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v8

    const/16 v9, 0x4cc

    sget v10, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v10, v10, 0x162

    const/16 v11, 0xa8c

    invoke-static {v8, v9, v10, v11}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v2, v8}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v10

    invoke-static {p0, v4}, Lkevin/fun/hook/download/DownloadManager;->ۣ۟۠۠ۢ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v9

    const/16 v12, 0x4d0

    sget v13, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v13, v13, 0x42

    const/16 v14, 0x769

    invoke-static {v9, v12, v13, v14}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v4, v9}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v10, v11}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p2

    invoke-static {p0, v0, v3}, Lkevin/fun/hook/download/DownloadManager;->ۣ۟ۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p3

    invoke-static {p0, v0, v3}, Lkevin/fun/hook/download/DownloadManager;->ۣ۟ۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v4

    const v3, 0xbe7f

    :goto_3
    const v10, 0xbe90

    xor-int/2addr v3, v10

    sparse-switch v3, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v3, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v4, :cond_2

    const v3, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {v6}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۣ۟۠۟(Ljava/lang/Object;)J

    move-result-wide v10

    const v3, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_c
    const v3, 0xbf39

    goto :goto_4

    :sswitch_d
    const-wide/16 v12, 0x0

    cmp-long v3, v10, v12

    if-eqz v3, :cond_3

    const v3, 0xc1e3

    goto :goto_4

    :sswitch_e
    invoke-static {v9}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v4

    const v3, 0xc202

    :goto_5
    const v7, 0xc213

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    if-eqz v4, :cond_4

    const v3, 0xc25f

    goto :goto_5

    :cond_4
    :sswitch_10
    const v3, 0xc240

    goto :goto_5

    :sswitch_11
    invoke-static {v9}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۣ۟۠۟(Ljava/lang/Object;)J

    move-result-wide v10

    const v3, 0xc27e

    :goto_6
    const v4, 0xc28f

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_6

    goto :goto_6

    :cond_5
    :sswitch_12
    const v3, 0xc2bc

    goto :goto_6

    :sswitch_13
    const-wide/16 v12, 0x0

    cmp-long v3, v10, v12

    if-eqz v3, :cond_5

    const v3, 0xc2db

    goto :goto_6

    :sswitch_14
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-static {p0, v0, v1, v8, v2}, Lkevin/fun/hook/download/DownloadManager;->ۢۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v7

    const v4, 0xc2fa

    :goto_7
    const v8, 0xc30b

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_7

    goto :goto_7

    :sswitch_15
    if-eqz v7, :cond_6

    const v4, 0xc5e2

    goto :goto_7

    :cond_6
    :sswitch_16
    const v4, 0xc5c3

    goto :goto_7

    :sswitch_17
    invoke-static {v3}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۣ۟۠۟(Ljava/lang/Object;)J

    move-result-wide v10

    const v4, 0xc601

    :goto_8
    const v7, 0xc612

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_8

    goto :goto_8

    :sswitch_18
    const-wide/16 v12, 0x0

    cmp-long v4, v10, v12

    if-nez v4, :cond_7

    const v4, 0xc65e

    goto :goto_8

    :cond_7
    :sswitch_19
    const v4, 0xc63f

    goto :goto_8

    :sswitch_1a
    invoke-static {v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۤۧ۠(Ljava/lang/Object;)J

    move-result-wide v10

    invoke-static {p0, v5, v10, v11}, Lkevin/fun/hook/download/DownloadManager;->ۨ۠ۡۢ(Ljava/lang/Object;Ljava/lang/Object;J)Ljava/io/File;

    move-result-object v3

    const v4, 0xc67d

    :goto_9
    const v5, 0xc68e

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_9

    goto :goto_9

    :cond_8
    :sswitch_1b
    const v4, 0xc6bb

    goto :goto_9

    :sswitch_1c
    if-eqz v3, :cond_8

    const v4, 0xc965

    goto :goto_9

    :sswitch_1d
    invoke-static {v3}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v5

    const v4, 0xc984

    :goto_a
    const v7, 0xc995

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_a

    goto :goto_a

    :sswitch_1e
    if-eqz v5, :cond_9

    const v4, 0xc9e1

    goto :goto_a

    :cond_9
    :sswitch_1f
    const v4, 0xc9c2

    goto :goto_a

    :sswitch_20
    invoke-static {v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۦ۠ۤۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :sswitch_21
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x4db

    sget v7, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v7, v7, -0xe7

    const/16 v8, 0x530

    invoke-static {v4, v5, v7, v8}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p1

    move-object/from16 v1, p5

    invoke-static {p0, v0, v1, v4}, Lkevin/fun/hook/download/DownloadManager;->۟ۧ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v4

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p1

    invoke-static {p0, v0, v5, v4}, Lkevin/fun/hook/download/DownloadManager;->ۨۡۢۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v2

    invoke-static {v2}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۥ۟ۡ(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0xca00

    :goto_b
    const v5, 0xca11

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_b

    goto :goto_b

    :cond_a
    :sswitch_22
    const v2, 0xca3e

    goto :goto_b

    :sswitch_23
    if-nez v4, :cond_a

    const v2, 0xca5d

    goto :goto_b

    :sswitch_24
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۦۡۦۧ()Landroid/os/Handler;

    move-result-object v2

    new-instance v4, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda16;

    move/from16 v0, p4

    move-object/from16 v1, p1

    invoke-direct {v4, p0, v0, v1}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda16;-><init>(Lkevin/fun/hook/download/DownloadManager;ZLandroid/content/Context;)V

    invoke-static {v2, v4}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v2, 0xca7c

    :goto_c
    const v4, 0xca8d

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_c

    goto :goto_c

    :sswitch_25
    const v2, 0xcd26

    goto :goto_c

    :sswitch_26
    invoke-static {v6}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣ۟ۢۤ(Ljava/lang/Object;)Z

    invoke-static {v9}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣ۟ۢۤ(Ljava/lang/Object;)Z

    invoke-static {v3}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣ۟ۢۤ(Ljava/lang/Object;)Z

    return-void

    :sswitch_27
    new-instance v3, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v5

    const/16 v6, 0x4e5

    sget v7, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v7, v7, 0x352

    const/16 v8, 0x7e6

    invoke-static {v5, v6, v7, v8}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v3

    :sswitch_28
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x4ee

    sget v6, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v6, v6, -0x3e

    const/16 v7, 0x278

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v8}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_29
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x4f6

    sget v6, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v6, v6, 0x17c

    const/16 v8, 0x664

    invoke-static {v4, v5, v6, v8}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

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

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_29
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_29
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_28
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_28
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_1a
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_21
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_27
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_1f
        0x57 -> :sswitch_27
        0x74 -> :sswitch_20
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_22
        0x11 -> :sswitch_23
        0x2f -> :sswitch_26
        0x4c -> :sswitch_24
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_25
        0x7ab -> :sswitch_26
    .end sparse-switch
.end method

.method private synthesizeLivePhoto(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    const/4 v3, 0x0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x4fe

    sget v4, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v4, v4, 0x7b

    const/16 v5, 0xbfd

    invoke-static {v1, v2, v4, v5}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v5

    :try_start_0
    invoke-static {p0, p1, p2}, Lkevin/fun/hook/download/DownloadManager;->ۣۣۨۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    move-result-object v4

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
    if-eqz v4, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    :try_start_1
    invoke-static {v4}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v2, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x507

    sget v6, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v6, v6, -0x77

    const/16 v7, 0xacb

    invoke-static {v1, v2, v6, v7}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

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
    invoke-static {p1}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۧۥۤۨ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v2, v1}, Lkevin/fun/hook/download/DownloadManager;->ۣۤۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v6, 0x51a

    sget v7, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v7, v7, 0x17c

    const/16 v8, 0x728

    invoke-static {v2, v6, v7, v8}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Class;

    sget v7, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v7, v7, 0x35b

    const-class v8, Ljava/lang/String;

    aput-object v8, v6, v7

    sget v7, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v7, v7, 0x10d

    const-class v8, Ljava/lang/String;

    aput-object v8, v6, v7

    sget v7, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v7, v7, 0xf1

    const-class v8, Ljava/lang/String;

    aput-object v8, v6, v7

    invoke-static {v1, v2, v6}, Landroidx/activity/ۦۧۥۥ;->۠۟۠ۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۣۨۧ(Ljava/lang/Object;Z)V

    invoke-static {v4}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۦ۠ۤۡ(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_9

    move-result-object v2

    const/4 v6, 0x3

    :try_start_2
    new-array v6, v6, [Ljava/lang/Object;

    sget v7, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v7, v7, 0x335

    aput-object v2, v6, v7

    sget v2, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v2, v2, -0x36

    aput-object p3, v6, v2

    sget v2, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v2, v2, 0xf1

    aput-object p4, v6, v2

    const/4 v2, 0x0

    invoke-static {v1, v2, v6}, Landroidx/loader/ۢۥ۟;->۟ۤ۟ۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    move-result-object v6

    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v1, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v6, :cond_3

    const v1, 0xbedc

    goto :goto_3

    :sswitch_b
    :try_start_3
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x51f

    sget v7, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v7, v7, -0x25b

    const/16 v8, 0x623

    invoke-static {v1, v2, v7, v8}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lkevin/fun/hook/download/DownloadManager;->۟۠۟ۦۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v7, v2, Ljava/util/List;

    const v1, 0xbefb

    :goto_4
    const v8, 0xbf0c

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_c
    const v1, 0xbf39

    goto :goto_4

    :sswitch_d
    if-eqz v7, :cond_4

    const v1, 0xc1e3

    goto :goto_4

    :sswitch_e
    move-object v0, v2

    check-cast v0, Ljava/util/List;

    move-object v1, v0

    invoke-static {v1}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v7

    const v1, 0xc202

    :goto_5
    const v8, 0xc213

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    if-lez v7, :cond_5

    const v1, 0xc25f

    goto :goto_5

    :cond_5
    :sswitch_10
    const v1, 0xc240

    goto :goto_5

    :sswitch_11
    check-cast v2, Ljava/util/List;

    const/4 v1, 0x0

    invoke-static {v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۦۣ۟۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    const v2, 0xc27e

    :goto_6
    const v7, 0xc28f

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_6

    goto :goto_6

    :goto_7
    :sswitch_12
    const v2, 0xc2fa

    :goto_8
    const v7, 0xc30b

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_13
    if-eqz v1, :cond_6

    const v2, 0xc5e2

    goto :goto_8

    :sswitch_14
    const v2, 0xc29d

    goto :goto_6

    :catch_0
    move-exception v1

    :try_start_4
    invoke-static {v1}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v7

    const/16 v8, 0x522

    sget v9, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v9, v9, -0x2b

    const/16 v10, 0x44c

    invoke-static {v7, v8, v9, v10}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/download/DownloadManager;->ۡۨ۟(Ljava/lang/Object;)V

    move-object v1, v3

    goto :goto_7

    :cond_6
    :sswitch_15
    const v2, 0xc5c3

    goto :goto_8

    :sswitch_16
    invoke-static {v1}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v7

    const v2, 0xc601

    :goto_9
    const v8, 0xc612

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_8

    goto :goto_9

    :sswitch_17
    if-eqz v7, :cond_7

    const v2, 0xc65e

    goto :goto_9

    :cond_7
    :sswitch_18
    const v2, 0xc63f

    goto :goto_9

    :sswitch_19
    invoke-static {v6}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۡۢ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v2, 0xc67d

    :goto_a
    const v8, 0xc68e

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_9

    goto :goto_a

    :cond_8
    :sswitch_1a
    const v2, 0xc6bb

    goto :goto_a

    :sswitch_1b
    if-eqz v7, :cond_8

    const v2, 0xc965

    goto :goto_a

    :sswitch_1c
    invoke-static {v6, v5}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۥۤۢ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    sget v5, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v5, v5, -0x74

    add-int/2addr v5, v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v7, 0x541

    const/4 v8, 0x1

    const/16 v9, 0x647

    invoke-static {v2, v7, v8, v9}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2, v5}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۣ۟۠۟(Ljava/lang/Object;Ljava/lang/Object;I)I

    move-result v7

    const v2, 0xc984

    :goto_b
    const v8, 0xc995

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_a

    goto :goto_b

    :sswitch_1d
    if-le v7, v5, :cond_9

    const v2, 0xc9e1

    goto :goto_b

    :cond_9
    :sswitch_1e
    const v2, 0xc9c2

    goto :goto_b

    :sswitch_1f
    invoke-static {v6, v5, v7}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۦ۠ۡ۠(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v1

    :goto_c
    :sswitch_20
    const v2, 0xca00

    :goto_d
    const v5, 0xca11

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_b

    goto :goto_d

    :cond_a
    :sswitch_21
    const v2, 0xca3e

    goto :goto_d

    :sswitch_22
    if-eqz v1, :cond_a

    const v2, 0xca5d

    goto :goto_d

    :sswitch_23
    invoke-static {v1}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v5

    const v2, 0xca7c

    :goto_e
    const v6, 0xca8d

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_c

    goto :goto_e

    :sswitch_24
    if-nez v5, :cond_b

    const v2, 0xcd64

    goto :goto_e

    :cond_b
    :sswitch_25
    const v2, 0xcd45

    goto :goto_e

    :sswitch_26
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v5

    const v2, 0xcd83

    :goto_f
    const v6, 0xcd94

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_d

    goto :goto_f

    :sswitch_27
    if-eqz v5, :cond_c

    const v2, 0xcde0

    goto :goto_f

    :cond_c
    :sswitch_28
    const v2, 0xcdc1

    goto :goto_f

    :sswitch_29
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۦ۠ۤۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۦ۠ۤۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    move-result v6

    const v1, 0xcdff

    :goto_10
    const v7, 0xce10

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_e

    goto :goto_10

    :cond_d
    :sswitch_2a
    const v1, 0xce3d

    goto :goto_10

    :sswitch_2b
    if-nez v6, :cond_d

    const v1, 0xd0e7

    goto :goto_10

    :sswitch_2c
    :try_start_5
    new-instance v6, Ljava/io/FileInputStream;

    invoke-direct {v6, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :try_start_6
    new-instance v7, Ljava/io/FileOutputStream;

    invoke-direct {v7, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    const/16 v1, 0x1000

    :try_start_7
    new-array v2, v1, [B

    :sswitch_2d
    invoke-static {v6, v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟ۨۧ(Ljava/lang/Object;Ljava/lang/Object;)I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-result v5

    const v1, 0xd106

    :goto_11
    const v8, 0xd117

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_f

    goto :goto_11

    :sswitch_2e
    if-gtz v5, :cond_e

    const v1, 0xd163

    goto :goto_11

    :cond_e
    :sswitch_2f
    const v1, 0xd144

    goto :goto_11

    :sswitch_30
    :try_start_8
    invoke-static {v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_a

    :try_start_9
    invoke-static {v6}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۥ۟ۢ۟(Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    const v1, 0xd182

    :goto_12
    const v2, 0xd193

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_10

    goto :goto_12

    :sswitch_31
    const v1, 0xd1a1

    goto :goto_12

    :sswitch_32
    const/4 v1, 0x0

    :try_start_a
    invoke-static {v7, v2, v1, v5}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠ۦۤۧ(Ljava/lang/Object;Ljava/lang/Object;II)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    const v1, 0xd1fe

    :goto_13
    const v5, 0xd20f

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_11

    goto :goto_13

    :sswitch_33
    const v1, 0xd4a8

    goto :goto_13

    :catchall_0
    move-exception v1

    move-object v2, v1

    :try_start_b
    invoke-static {v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V

    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :catchall_1
    move-exception v1

    move-object v3, v2

    :goto_14
    const v2, 0xd505

    :goto_15
    const v5, 0xd516

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_12

    goto :goto_15

    :sswitch_34
    const v2, 0xd524

    goto :goto_15

    :catchall_2
    move-exception v1

    :sswitch_35
    const v2, 0xd581

    :goto_16
    const v5, 0xd592

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_13

    goto :goto_16

    :sswitch_36
    if-eqz v3, :cond_f

    const v2, 0xd869

    goto :goto_16

    :cond_f
    :sswitch_37
    const v2, 0xd5bf

    goto :goto_16

    :sswitch_38
    const v2, 0xd888

    :goto_17
    const v5, 0xd899

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_14

    goto :goto_17

    :sswitch_39
    if-eq v3, v1, :cond_10

    const v2, 0xd8e5

    goto :goto_17

    :cond_10
    :sswitch_3a
    const v2, 0xd8c6

    goto :goto_17

    :sswitch_3b
    :try_start_c
    invoke-static {v3, v1}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xd904

    :goto_18
    const v2, 0xd915

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_15

    goto :goto_18

    :sswitch_3c
    const v1, 0xd923

    goto :goto_18

    :catchall_3
    move-exception v1

    const v2, 0xd980

    :goto_19
    const v5, 0xd991

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_16

    goto :goto_19

    :sswitch_3d
    const v2, 0xdc2a

    goto :goto_19

    :sswitch_3e
    move-object v3, v1

    :sswitch_3f
    invoke-static {v6}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۥ۟ۢ۟(Ljava/lang/Object;)V

    throw v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :catchall_4
    move-exception v1

    :sswitch_40
    const v2, 0xdc87

    :goto_1a
    const v5, 0xdc98

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_17

    goto :goto_1a

    :sswitch_41
    if-eqz v3, :cond_11

    const v2, 0xdce4

    goto :goto_1a

    :cond_11
    :sswitch_42
    const v2, 0xdcc5

    goto :goto_1a

    :sswitch_43
    const v2, 0xdd03

    :goto_1b
    const v5, 0xdd14

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_18

    goto :goto_1b

    :sswitch_44
    if-eq v3, v1, :cond_12

    const v2, 0x170090

    goto :goto_1b

    :cond_12
    :sswitch_45
    const v2, 0xdd41

    goto :goto_1b

    :sswitch_46
    :try_start_d
    invoke-static {v3, v1}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x1700af

    :goto_1c
    const v2, 0x1700c0

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_19

    goto :goto_1c

    :goto_1d
    :sswitch_47
    throw v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    :catchall_5
    move-exception v1

    const v2, 0x170831

    :goto_1e
    const v3, 0x170842

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_1a

    goto :goto_1e

    :goto_1f
    :sswitch_48
    :try_start_e
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-static {v1}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v6

    const/16 v7, 0x574

    sget v8, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v8, v8, 0x78

    const/16 v9, 0x7dc

    invoke-static {v6, v7, v8, v9}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :catchall_6
    move-exception v1

    const v2, 0x170929

    :goto_20
    const v3, 0x17093a

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_1b

    goto :goto_20

    :sswitch_49
    if-eqz v4, :cond_17

    const v2, 0x170c11

    goto :goto_20

    :sswitch_4a
    const v1, 0x1700ce

    goto :goto_1c

    :sswitch_4b
    move-object v3, v1

    goto :goto_1d

    :sswitch_4c
    :try_start_f
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v2

    const v1, 0x17012b

    :goto_21
    const v3, 0x17013c

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_1c

    goto :goto_21

    :sswitch_4d
    if-eqz v2, :cond_13

    const v1, 0x170188

    goto :goto_21

    :cond_13
    :sswitch_4e
    const v1, 0x170169

    goto :goto_21

    :sswitch_4f
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    sget v2, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v2, v2, -0x36

    aput-object p4, v1, v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x542

    sget v5, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v5, v5, -0x266

    const/16 v6, 0x9af

    invoke-static {v2, v3, v5, v6}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    sget v5, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v5, v5, -0x220

    aput-object v2, v3, v5
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    const/4 v2, 0x0

    :try_start_10
    invoke-static {p1, v1, v3, v2}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۤۨۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    const v1, 0x1701a7

    :goto_22
    const v2, 0x1701b8

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_1d

    goto :goto_22

    :sswitch_50
    if-eqz v4, :cond_14

    const v1, 0x17048f

    goto :goto_22

    :cond_14
    :sswitch_51
    const v1, 0x170470

    goto :goto_22

    :sswitch_52
    invoke-static {v4}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v2

    const v1, 0x1704ae

    :goto_23
    const v3, 0x1704bf

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_1e

    goto :goto_23

    :sswitch_53
    if-eqz v2, :cond_15

    const v1, 0x17050b

    goto :goto_23

    :cond_15
    :sswitch_54
    const v1, 0x1704ec

    goto :goto_23

    :sswitch_55
    invoke-static {v4}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣ۟ۢۤ(Ljava/lang/Object;)Z

    :sswitch_56
    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

    move-result v2

    const v1, 0x17052a

    :goto_24
    const v3, 0x17053b

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_1f

    goto :goto_24

    :sswitch_57
    if-ltz v2, :cond_16

    const v1, 0x170812

    goto :goto_24

    :cond_16
    :sswitch_58
    const v1, 0x170568

    goto :goto_24

    :sswitch_59
    const-string v1, "JRVxisynCgKw8z71GCBPW6xOfzTW"

    invoke-static {v1}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۧۢ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_5a
    return-void

    :sswitch_5b
    :try_start_11
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x54c

    sget v5, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v5, v5, 0x394

    const/16 v6, 0xa38

    invoke-static {v2, v3, v5, v6}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_7
    move-exception v1

    const v2, 0x1708ad

    :goto_25
    const v3, 0x1708be

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_20

    goto :goto_25

    :sswitch_5c
    const v2, 0x1708cc

    goto :goto_25

    :sswitch_5d
    const v2, 0x170850

    goto/16 :goto_1e

    :sswitch_5e
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x562

    sget v5, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v5, v5, -0x3b5

    const/16 v6, 0xbe7

    invoke-static {v2, v3, v5, v6}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :sswitch_5f
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x56c

    sget v5, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v5, v5, -0x7e

    const/16 v6, 0x87d

    invoke-static {v2, v3, v5, v6}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    :catchall_8
    move-exception v1

    :goto_26
    move-object v4, v3

    goto/16 :goto_1f

    :cond_17
    :sswitch_60
    const v2, 0x170bf2

    goto/16 :goto_20

    :sswitch_61
    invoke-static {v4}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0x170c30

    :goto_27
    const v5, 0x170c41

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_21

    goto :goto_27

    :cond_18
    :sswitch_62
    const v2, 0x170c6e

    goto :goto_27

    :sswitch_63
    if-eqz v3, :cond_18

    const v2, 0x170c8d

    goto :goto_27

    :sswitch_64
    invoke-static {v4}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣ۟ۢۤ(Ljava/lang/Object;)Z

    :sswitch_65
    throw v1

    :catchall_9
    move-exception v1

    move-object v3, v4

    goto :goto_26

    :catchall_a
    move-exception v1

    goto/16 :goto_14

    :sswitch_66
    move-object v1, v3

    goto/16 :goto_7

    :sswitch_67
    move-object v1, v3

    goto/16 :goto_c

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_5f
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5f
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_5e
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_67
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_66
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_66
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_13
        0x6af -> :sswitch_15
        0x6c8 -> :sswitch_19
        0x6e9 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x2d -> :sswitch_20
        0x32 -> :sswitch_18
        0x4c -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0x35 -> :sswitch_20
        0xf3 -> :sswitch_1b
        0xfeb -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1d
        0x36 -> :sswitch_1e
        0x57 -> :sswitch_20
        0x74 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_21
        0x11 -> :sswitch_22
        0x2f -> :sswitch_4c
        0x4c -> :sswitch_23
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_25
        0x7c8 -> :sswitch_4c
        0x7e9 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_27
        0x36 -> :sswitch_28
        0x55 -> :sswitch_4c
        0x74 -> :sswitch_29
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2a
        0x2d -> :sswitch_4f
        0x3ef -> :sswitch_2b
        0x1ef7 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2e
        0x32 -> :sswitch_2f
        0x53 -> :sswitch_32
        0x74 -> :sswitch_30
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_31
        0x32 -> :sswitch_4f
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_33
        0x6a7 -> :sswitch_2d
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_34
        0x32 -> :sswitch_35
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_36
        0x2d -> :sswitch_3e
        0x32 -> :sswitch_37
        0xdfb -> :sswitch_38
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_39
        0x3e -> :sswitch_3a
        0x5f -> :sswitch_3f
        0x7c -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3c
        0x36 -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_3d
        0x5bb -> :sswitch_40
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_41
        0x3e -> :sswitch_42
        0x5d -> :sswitch_4b
        0x7c -> :sswitch_43
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_44
        0x36 -> :sswitch_45
        0x55 -> :sswitch_47
        0x17dd84 -> :sswitch_46
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_47
        0x6f -> :sswitch_4a
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x12 -> :sswitch_48
        0x73 -> :sswitch_5d
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x13 -> :sswitch_49
        0x2c8 -> :sswitch_65
        0x2e9 -> :sswitch_60
        0x52b -> :sswitch_61
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x17 -> :sswitch_4d
        0x55 -> :sswitch_5b
        0x76 -> :sswitch_4e
        0xb4 -> :sswitch_4f
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x1f -> :sswitch_50
        0x537 -> :sswitch_52
        0x5c8 -> :sswitch_56
        0x5e9 -> :sswitch_51
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x11 -> :sswitch_53
        0x53 -> :sswitch_56
        0x72 -> :sswitch_54
        0x1b4 -> :sswitch_55
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x11 -> :sswitch_57
        0x53 -> :sswitch_5a
        0x72 -> :sswitch_58
        0xd29 -> :sswitch_59
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_5c
        0x72 -> :sswitch_48
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0xe -> :sswitch_62
        0x2f -> :sswitch_65
        0x71 -> :sswitch_63
        0xcc -> :sswitch_64
    .end sparse-switch
.end method

.method private updateProgressUI(Landroid/app/Dialog;[Landroid/widget/TextView;[Landroid/widget/ProgressBar;[Landroid/widget/TextView;IJJJ)V
    .locals 14

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۦۡۦۧ()Landroid/os/Handler;

    move-result-object v12

    new-instance v0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda2;

    move-object v1, p1

    move-object/from16 v2, p3

    move/from16 v3, p5

    move-object/from16 v4, p2

    move-object/from16 v5, p4

    move-wide/from16 v6, p8

    move-wide/from16 v8, p10

    move-wide/from16 v10, p6

    invoke-direct/range {v0 .. v11}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda2;-><init>(Landroid/app/Dialog;[Landroid/widget/ProgressBar;I[Landroid/widget/TextView;[Landroid/widget/TextView;JJJ)V

    invoke-static {v12, v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "0CzGj9W0xf5vdUfFYlLjDG7w9V"

    invoke-static {v0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟ۡۨ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۟۟۠ۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IJJ)V
    .locals 8

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/download/DownloadManager;

    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    move v3, p3

    move-wide v4, p4

    move-wide v6, p6

    invoke-direct/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->showDownloadProgressNotification(Landroid/content/Context;Ljava/lang/String;IJJ)V

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

.method public static ۣ۟۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IJJJ)V
    .locals 12

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
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/download/DownloadManager;

    move-object v1, p1

    check-cast v1, Landroid/app/Dialog;

    move-object v2, p2

    check-cast v2, [Landroid/widget/TextView;

    move-object v3, p3

    check-cast v3, [Landroid/widget/ProgressBar;

    move-object/from16 v4, p4

    check-cast v4, [Landroid/widget/TextView;

    move/from16 v5, p5

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    move-wide/from16 v10, p10

    invoke-direct/range {v0 .. v11}, Lkevin/fun/hook/download/DownloadManager;->updateProgressUI(Landroid/app/Dialog;[Landroid/widget/TextView;[Landroid/widget/ProgressBar;[Landroid/widget/TextView;IJJJ)V

    :sswitch_3
    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

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
    const-string v0, "RoG"

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

.method public static ۟۟ۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)I
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Landroid/content/Context;

    invoke-direct {p0, p1, p2}, Lkevin/fun/hook/download/DownloadManager;->dp(Landroid/content/Context;F)I

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

.method public static ۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    invoke-direct {p0, p1, p2, p3}, Lkevin/fun/hook/download/DownloadManager;->generateFileName(Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

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

.method public static ۟۟ۨۥۣ(Ljava/lang/Object;JLjava/lang/Object;)Lokhttp3/OkHttpClient$Builder;
    .locals 3

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
    check-cast p0, Lokhttp3/OkHttpClient$Builder;

    check-cast p3, Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, p1, p2, p3}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

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

.method public static ۟۠۟ۦۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

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

.method public static ۟۠۟ۧۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/String;

    invoke-direct {p0, p1, p2}, Lkevin/fun/hook/download/DownloadManager;->showSuccessToast(Landroid/content/Context;Ljava/lang/String;)V

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

.method public static ۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->batchManager:Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

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

.method public static ۣ۟ۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/io/File;

    invoke-direct {p0, p1, p2}, Lkevin/fun/hook/download/DownloadManager;->downloadFile(Ljava/lang/String;Ljava/io/File;)V

    :sswitch_3
    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

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
    const-string v0, "qacrT1P"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۧۦۧ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣۣ۟ۡ۟(Ljava/lang/Object;)I
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
    check-cast p0, Lokhttp3/Response;

    invoke-virtual {p0}, Lokhttp3/Response;->code()I

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

.method public static ۟ۡۤ۟ۢ()Lokhttp3/OkHttpClient;
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
    sget-object v0, Lkevin/fun/hook/download/DownloadManager;->OK_HTTP_CLIENT:Lokhttp3/OkHttpClient;

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

.method public static ۟ۡۨۧ(Ljava/lang/Object;)V
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
    check-cast p0, Lokhttp3/Call;

    invoke-interface {p0}, Lokhttp3/Call;->cancel()V

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

.method public static ۟ۢۢ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/io/File;

    invoke-direct {p0, p1, p2}, Lkevin/fun/hook/download/DownloadManager;->downloadFileSync(Ljava/lang/String;Ljava/io/File;)V

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

.method public static ۟ۢۤۨ()[S
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/download/DownloadManager;->short:[S

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

.method public static ۟ۢۤۨۨ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    invoke-direct {p0}, Lkevin/fun/hook/download/DownloadManager;->getTimestamp()Ljava/lang/String;

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

.method public static ۣ۟ۢۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/app/Dialog;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    invoke-direct {p0, p1, p2, p3}, Lkevin/fun/hook/download/DownloadManager;->createProgressDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;

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

.method public static ۟ۢۧۧۡ(Ljava/lang/Object;)V
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
    check-cast p0, Lokhttp3/Response;

    invoke-virtual {p0}, Lokhttp3/Response;->close()V

    :sswitch_3
    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

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
    const-string v0, "LJ2u4u142OE9ArC4SeuYbMI"

    invoke-static {v0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥ۟ۡۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣ۟۠۠ۢ(Ljava/lang/Object;I)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    invoke-direct {p0, p1}, Lkevin/fun/hook/download/DownloadManager;->getRandomString(I)Ljava/lang/String;

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

.method public static ۣ۟۠ۢۥ(Ljava/lang/Object;)J
    .locals 3

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
    check-cast p0, Lokhttp3/ResponseBody;

    invoke-virtual {p0}, Lokhttp3/ResponseBody;->contentLength()J

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

.method public static ۟ۤۢ۠ۤ()I
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
    sget v0, Lkevin/fun/hook/download/DownloadManager$ViewTags;->background_btn:I

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

.method public static ۟ۥ۠ۧۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 8

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
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/download/DownloadManager;

    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    move-object v3, p3

    check-cast v3, Ljava/lang/String;

    move-object v4, p4

    check-cast v4, Ljava/lang/String;

    move-object v5, p5

    check-cast v5, Ljava/lang/String;

    move-object v6, p6

    check-cast v6, Ljava/lang/String;

    move v7, p7

    invoke-direct/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->startDownload(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

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

.method public static ۟ۥۣ۟ۥ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkVideoId:Ljava/lang/String;

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

.method public static ۟ۥۧۡۤ(Ljava/lang/Object;)J
    .locals 3

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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    iget-wide v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkCreateTime:J

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

.method public static ۟ۦۢ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/String;

    invoke-direct {p0, p1, p2}, Lkevin/fun/hook/download/DownloadManager;->downloadCommentVideoSilent(Landroid/content/Context;Ljava/lang/String;)V

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

.method public static ۟ۦۣۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Landroid/view/View;

    check-cast p2, [Landroid/widget/TextView;

    check-cast p3, [Landroid/widget/ProgressBar;

    check-cast p4, [Landroid/widget/TextView;

    invoke-direct {p0, p1, p2, p3, p4}, Lkevin/fun/hook/download/DownloadManager;->findProgressViews(Landroid/view/View;[Landroid/widget/TextView;[Landroid/widget/ProgressBar;[Landroid/widget/TextView;)V

    :sswitch_3
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
    const-string v0, "YgMDqG"

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->ۨۤۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۟ۦۣۦ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/String;

    invoke-direct {p0, p1, p2}, Lkevin/fun/hook/download/DownloadManager;->showErrorToast(Landroid/content/Context;Ljava/lang/String;)V

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

.method public static ۟ۦۤۤ۠(Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/OkHttpClient$Builder;
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
    check-cast p0, Lokhttp3/OkHttpClient$Builder;

    check-cast p1, Lokhttp3/ConnectionPool;

    invoke-virtual {p0, p1}, Lokhttp3/OkHttpClient$Builder;->connectionPool(Lokhttp3/ConnectionPool;)Lokhttp3/OkHttpClient$Builder;

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

.method public static ۟ۦۥۦۡ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkAuthorName:Ljava/lang/String;

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

.method public static ۟ۦۧۦۦ(Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    invoke-direct {p0}, Lkevin/fun/hook/download/DownloadManager;->cancelDownloadNotification()V

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

.method public static ۟ۦۧۧ۟(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentAuthorUid:Ljava/lang/String;

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

.method public static ۟ۧ۟ۧ۟(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentId:Ljava/lang/String;

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

.method public static ۣ۟ۧ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Request$Builder;
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
    check-cast p0, Lokhttp3/Request$Builder;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

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

.method public static ۟ۧ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/net/Uri;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    invoke-direct {p0, p1, p2, p3}, Lkevin/fun/hook/download/DownloadManager;->createOutputUri(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

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

.method public static ۣ۟ۧۤ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V
    .locals 6

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
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/download/DownloadManager;

    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    move-object v3, p3

    check-cast v3, Ljava/lang/String;

    move-object v5, p5

    check-cast v5, Ljava/lang/String;

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lkevin/fun/hook/download/DownloadManager;->synthesizeAndSaveLivePhoto(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    :sswitch_3
    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

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
    const-string v0, "fddJtfaMmKkBP76C"

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۧۢۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۟ۧۧۥۦ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentText:Ljava/lang/String;

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

.method public static ۟ۨۡۧ(Ljava/lang/Object;)Lokhttp3/Response;
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
    check-cast p0, Lokhttp3/Call;

    invoke-interface {p0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

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

.method public static ۟ۨۧۤ(Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/OkHttpClient$Builder;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lokhttp3/OkHttpClient$Builder;

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lokhttp3/OkHttpClient$Builder;->protocols(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;

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

.method public static ۠۠ۤۢ(Ljava/lang/Object;)J
    .locals 3

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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    iget-wide v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentCreateTime:J

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

.method public static ۡۡۦۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZZLjava/lang/Object;)V
    .locals 7

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
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/download/DownloadManager;

    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    move-object v3, p3

    check-cast v3, Ljava/lang/String;

    move-object v6, p6

    check-cast v6, Ljava/lang/String;

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lkevin/fun/hook/download/DownloadManager;->downloadLivePhoto(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V

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

.method public static ۣۡۡۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

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
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/download/DownloadManager;

    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    move-object v3, p3

    check-cast v3, Landroid/net/Uri;

    move-object v4, p4

    check-cast v4, Lkevin/fun/hook/download/DownloadManager$ProgressCallback;

    move-object v5, p5

    check-cast v5, [Lokhttp3/Call;

    invoke-direct/range {v0 .. v5}, Lkevin/fun/hook/download/DownloadManager;->downloadFileWithProgress(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Lkevin/fun/hook/download/DownloadManager$ProgressCallback;[Lokhttp3/Call;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

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
    const-string v0, "fd"

    invoke-static {v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۟ۡ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۡۥۣۡ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkAuthorUid:Ljava/lang/String;

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

.method public static ۡۥۢۡ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentAuthorAccount:Ljava/lang/String;

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

.method public static ۡۥۧۤ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkVideoDesc:Ljava/lang/String;

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

.method public static ۡۦ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Landroid/content/Context;

    invoke-direct {p0, p1}, Lkevin/fun/hook/download/DownloadManager;->initNotificationChannel(Landroid/content/Context;)V

    :sswitch_3
    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

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
    const-string v0, "9OB0a3"

    invoke-static {v0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟ۡۨ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۡۧ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Request$Builder;
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
    check-cast p0, Lokhttp3/Request$Builder;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

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

.method public static ۡۨ۟(Ljava/lang/Object;)V
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    :sswitch_3
    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

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
    const-string v0, "8yMbRbcFHhR6Svid3CKLGotWpf"

    invoke-static {v0}, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۧۢۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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

.method public static ۣۡۨ(Ljava/lang/Object;)Lokhttp3/OkHttpClient;
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
    check-cast p0, Lokhttp3/OkHttpClient$Builder;

    invoke-virtual {p0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

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

.method public static ۢۡۦۦ(Ljava/lang/Object;)Z
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
    check-cast p0, Lokhttp3/Call;

    invoke-interface {p0}, Lokhttp3/Call;->isCanceled()Z

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

.method public static ۢۢۦ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/String;

    invoke-direct {p0, p1, p2, p3}, Lkevin/fun/hook/download/DownloadManager;->showDownloadCompleteNotification(Landroid/content/Context;Ljava/lang/String;Z)V

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

.method public static ۣۢۥۡ(Ljava/lang/Object;Z)Lokhttp3/OkHttpClient$Builder;
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
    check-cast p0, Lokhttp3/OkHttpClient$Builder;

    invoke-virtual {p0, p1}, Lokhttp3/OkHttpClient$Builder;->retryOnConnectionFailure(Z)Lokhttp3/OkHttpClient$Builder;

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

.method public static ۢۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Ljava/lang/String;

    invoke-direct {p0, p1, p2, p3, p4}, Lkevin/fun/hook/download/DownloadManager;->synthesizeLivePhoto(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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
    const-string v0, "16KX55yhHa01nJE1bZlzhuY7n99"

    invoke-static {v0}, Landroidx/loader/ۢۥ۟;->۟ۦۡۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣۢۡ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-direct {p0, p1, p2}, Lkevin/fun/hook/download/DownloadManager;->getFileExtension(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣۤۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Class;
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

    check-cast p1, Ljava/lang/ClassLoader;

    invoke-static {p0, p1}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

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

.method public static ۣۧۦ(Ljava/lang/Object;)Ljava/io/InputStream;
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
    check-cast p0, Lokhttp3/ResponseBody;

    invoke-virtual {p0}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

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

.method public static ۤۡ۟ۢ(Ljava/lang/Object;)Lokhttp3/Request;
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
    check-cast p0, Lokhttp3/Request$Builder;

    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

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

.method public static ۣۤ۠ۦ()I
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
    sget v0, Lkevin/fun/hook/download/DownloadManager$ViewTags;->cancel_btn:I

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

.method public static ۣۤۡۡ(Ljava/lang/Object;)Z
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
    check-cast p0, Lokhttp3/Response;

    invoke-virtual {p0}, Lokhttp3/Response;->isSuccessful()Z

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

.method public static ۥۨۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Landroid/net/Uri;

    invoke-direct {p0, p1, p2}, Lkevin/fun/hook/download/DownloadManager;->deletePartialFile(Landroid/content/Context;Landroid/net/Uri;)V

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

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
    const-string v0, "X1L3pLWZ2FyljtTYG"

    invoke-static {v0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۦۣۣۧ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۦۡۢ۠(Ljava/lang/Object;)Lokhttp3/ResponseBody;
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
    check-cast p0, Lokhttp3/Response;

    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

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

.method public static ۦۡۦ۟(Ljava/lang/Object;JLjava/lang/Object;)Lokhttp3/OkHttpClient$Builder;
    .locals 3

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
    check-cast p0, Lokhttp3/OkHttpClient$Builder;

    check-cast p3, Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, p1, p2, p3}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

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

.method public static ۦۡۦۧ()Landroid/os/Handler;
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
    sget-object v0, Lkevin/fun/hook/download/DownloadManager;->MAIN_HANDLER:Landroid/os/Handler;

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

.method public static ۦۢۢ۠(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkAuthorAccount:Ljava/lang/String;

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

.method public static ۦۣۦ۟(Ljava/lang/Object;JLjava/lang/Object;)Lokhttp3/OkHttpClient$Builder;
    .locals 3

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lokhttp3/OkHttpClient$Builder;

    check-cast p3, Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, p1, p2, p3}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

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

.method public static ۦۤۨ۟(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentAuthorName:Ljava/lang/String;

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

.method public static ۦۦ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/String;

    invoke-direct {p0, p1, p2, p3}, Lkevin/fun/hook/download/DownloadManager;->showCustomToast(Landroid/content/Context;Ljava/lang/String;I)V

    :sswitch_3
    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

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
    const-string v0, "La"

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۢۢۡۤ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Lokhttp3/Call;
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
    check-cast p0, Lokhttp3/OkHttpClient;

    check-cast p1, Lokhttp3/Request;

    invoke-virtual {p0, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

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

.method public static ۨ۠ۡۢ(Ljava/lang/Object;Ljava/lang/Object;J)Ljava/io/File;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1, p2, p3}, Lkevin/fun/hook/download/DownloadManager;->findOutputFileFromCache(Ljava/lang/String;J)Ljava/io/File;

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

.method public static ۨۡۢۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/io/File;

    check-cast p3, Landroid/net/Uri;

    invoke-direct {p0, p1, p2, p3}, Lkevin/fun/hook/download/DownloadManager;->copyFileToUri(Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;)V

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

.method public static ۣۣۨۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/io/File;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/String;

    invoke-direct {p0, p1, p2}, Lkevin/fun/hook/download/DownloadManager;->downloadImageToTempFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

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

.method public static ۨۤۡۧ()Lkevin/fun/hook/download/DownloadManager;
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
    sget-object v0, Lkevin/fun/hook/download/DownloadManager;->instance:Lkevin/fun/hook/download/DownloadManager;

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

.method public static ۨۥۣ۟()Ljava/util/concurrent/ExecutorService;
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/download/DownloadManager;->DOWNLOAD_EXECUTOR:Ljava/util/concurrent/ExecutorService;

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

.method public static ۨۧۡۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lkevin/fun/hook/download/DownloadManager;->generateSimpleFileName(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۨۧۥۦ()Landroidx/core/app/NotificationCompat$Builder;
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
    sget-object v0, Lkevin/fun/hook/download/DownloadManager;->notificationBuilder:Landroidx/core/app/NotificationCompat$Builder;

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

.method public static ۨۨ۠()Landroid/app/NotificationManager;
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
    sget-object v0, Lkevin/fun/hook/download/DownloadManager;->notificationManager:Landroid/app/NotificationManager;

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


# virtual methods
.method public batchDownloadCommentImages(Landroid/content/Context;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
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
    if-eqz p2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p2}, Landroidx/activity/ۤۧۧۧ;->ۡۥۦۦ(Ljava/lang/Object;)Z

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
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۤۡۢ(Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {p2}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v0, v1}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۥۨ۠ۨ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {p2}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v1

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x57e

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v4, v4, -0x3a4

    const/16 v5, 0x9f7

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, p1, v1, v2}, Landroidx/viewpager/ۣۢ۟ۤ;->۠ۥۣۤ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {p2}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۧ۟ۥۦ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :sswitch_8
    invoke-static {v1}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-nez v2, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {v1}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۥۣ۟()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    new-instance v3, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda7;

    invoke-direct {v3, p0, p1, v0}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda7;-><init>(Lkevin/fun/hook/download/DownloadManager;Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v2, v3}, Landroidx/activity/ۣۦۡۥ;->۟ۢ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_c
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_d
    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v1

    const v0, 0xc202

    :goto_5
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_e
    if-ltz v1, :cond_3

    const v0, 0xc25f

    goto :goto_5

    :cond_3
    :sswitch_f
    const v0, 0xc240

    goto :goto_5

    :sswitch_10
    const-string v0, "aJ"

    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->ۥۣۢۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_11
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_d
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
        0xb97b -> :sswitch_d
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_b
        0x4c -> :sswitch_11
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_8
        0x1f7 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_f
        0x4c -> :sswitch_10
        0x53 -> :sswitch_11
    .end sparse-switch
.end method

.method public batchDownloadWorkImages(Landroid/content/Context;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
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
    if-eqz p2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p2}, Landroidx/activity/ۤۧۧۧ;->ۡۥۦۦ(Ljava/lang/Object;)Z

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
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۤۡۢ(Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {p2}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v0, v1}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۥۨ۠ۨ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {p2}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v1

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x584

    sget v4, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v4, v4, -0xe5

    const/16 v5, 0x85c

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, p1, v1, v2}, Landroidx/viewpager/ۣۢ۟ۤ;->۠ۥۣۤ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {p2}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۧ۟ۥۦ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :sswitch_8
    invoke-static {v1}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-nez v2, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {v1}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۨۥۣ۟()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    new-instance v3, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda13;

    invoke-direct {v3, p0, p1, v0}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda13;-><init>(Lkevin/fun/hook/download/DownloadManager;Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v2, v3}, Landroidx/activity/ۣۦۡۥ;->۟ۢ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_c
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_d
    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

    move-result v1

    const v0, 0xc202

    :goto_5
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_e
    if-gtz v1, :cond_3

    const v0, 0xc25f

    goto :goto_5

    :cond_3
    :sswitch_f
    const v0, 0xc240

    goto :goto_5

    :sswitch_10
    const-string v0, "l6uNjP"

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->ۨۤۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_11
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_d
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
        0xb97b -> :sswitch_d
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_b
        0x4c -> :sswitch_11
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_8
        0x1f7 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_f
        0x4c -> :sswitch_10
        0x53 -> :sswitch_11
    .end sparse-switch
.end method

.method public clearCommentInfo()V
    .locals 4

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e3\u06e8"

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-void

    :sswitch_0
    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentId:Ljava/lang/String;

    const-string v1, "\u06e3\u06e4\u06e2"

    goto :goto_0

    :sswitch_1
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentCreateTime:J

    const-string v1, "\u06e0\u06e1"

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e8\u06e8\u06e3"

    goto :goto_0

    :sswitch_3
    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentAuthorName:Ljava/lang/String;

    const-string v1, "\u06e0\u06e2\u06e3"

    goto :goto_0

    :sswitch_4
    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentAuthorAccount:Ljava/lang/String;

    const-string v1, "\u06e8\u06e5\u06e2"

    goto :goto_0

    :sswitch_5
    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentText:Ljava/lang/String;

    const-string v1, "\u06e0\u06e0\u06e8"

    goto :goto_0

    :sswitch_6
    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentAuthorUid:Ljava/lang/String;

    const-string v1, "\u06e4\u06e1\u06e5"

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aaae8 -> :sswitch_1
        0x1aab21 -> :sswitch_4
        0x1ab6a1 -> :sswitch_5
        0x1aba08 -> :sswitch_0
        0x1ac94d -> :sswitch_2
        0x1ac985 -> :sswitch_6
        0x1ac9e3 -> :sswitch_3
    .end sparse-switch
.end method

.method public clearWorkInfo()V
    .locals 4

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e6\u06e3"

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkVideoId:Ljava/lang/String;

    const-string v1, "\u06e5\u06e6\u06e2"

    goto :goto_0

    :sswitch_0
    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkAuthorAccount:Ljava/lang/String;

    const-string v1, "\u06e0\u06e3\u06e4"

    goto :goto_0

    :sswitch_1
    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkAuthorUid:Ljava/lang/String;

    const-string v1, "\u06df\u06e6\u06e2"

    goto :goto_0

    :sswitch_2
    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkVideoDesc:Ljava/lang/String;

    const-string v1, "\u06e6\u06e2\u06e3"

    goto :goto_0

    :sswitch_3
    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkAuthorName:Ljava/lang/String;

    const-string v1, "\u06e7\u06e4\u06df"

    goto :goto_0

    :sswitch_4
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkCreateTime:J

    const-string v1, "\u06df\u06e8\u06e0"

    goto :goto_0

    :sswitch_5
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e2\u06e0\u06e4"

    goto :goto_0

    :sswitch_6
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa817 -> :sswitch_6
        0x1aab41 -> :sswitch_1
        0x1ab266 -> :sswitch_3
        0x1abe61 -> :sswitch_2
        0x1ac1a7 -> :sswitch_4
        0x1ac5a2 -> :sswitch_0
        0x1ac9a5 -> :sswitch_5
    .end sparse-switch
.end method

.method public downloadCommentAudio(Landroid/content/Context;Ljava/lang/String;)V
    .locals 11

    const/4 v7, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06df\u06e4"

    move-object v4, v0

    move-object v3, v0

    move-object v5, v0

    move-object v6, v0

    move-object v8, v0

    move v9, v2

    move v10, v2

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    const/16 v0, 0x58a

    const/16 v1, 0x7f4

    invoke-static {v8, v0, v9, v1}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v6

    const-string v0, "\u06e7\u06e7\u06e1"

    move-object v1, v0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۤۢۢ()Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06e1\u06e7\u06e8"

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v2, v10, 0x122

    const-string v0, "\u06df\u06e4"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x59b

    const/16 v1, 0x8ac

    invoke-static {v8, v0, v9, v1}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v6

    const-string v0, "\u06e4\u06e7\u06e7"

    move-object v1, v0

    goto :goto_0

    :sswitch_3
    const/16 v0, 0x59f

    const/16 v1, 0x96d

    invoke-static {v8, v0, v9, v1}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v3

    const-string v0, "\u06df\u06e3\u06e6"

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    const/16 v0, 0x58e

    const/16 v1, 0x191

    invoke-static {v8, v0, v9, v1}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06e5\u06e1"

    move-object v1, v0

    goto :goto_0

    :sswitch_5
    sget v2, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    const-string v0, "\u06e4\u06e0\u06e3"

    move-object v1, v0

    move v10, v2

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e8\u06e1\u06e5"

    move-object v8, v0

    goto :goto_0

    :sswitch_7
    sget v2, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    const-string v0, "\u06e8\u06e5\u06e3"

    move-object v1, v0

    move v10, v2

    goto :goto_0

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e2\u06e3\u06e8"

    move-object v8, v0

    goto :goto_0

    :sswitch_9
    xor-int/lit16 v2, v10, 0x207

    const-string v0, "\u06e3\u06e3\u06df"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_a
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->۟ۥ۠ۧۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    const-string v0, "\u06e8\u06e2\u06e1"

    move-object v1, v0

    goto :goto_0

    :sswitch_b
    sget v2, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    const-string v0, "\u06e4\u06e2\u06e0"

    move-object v1, v0

    move v10, v2

    goto :goto_0

    :sswitch_c
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e3\u06e2\u06e8"

    move-object v8, v0

    goto/16 :goto_0

    :sswitch_d
    xor-int/lit16 v2, v10, -0x1ac

    const-string v0, "\u06e6\u06e6"

    move-object v1, v0

    move v9, v2

    goto/16 :goto_0

    :sswitch_e
    invoke-static {p0, v5, v7, v6}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "\u06e4\u06e7"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_f
    xor-int/lit16 v2, v10, 0x3ad

    const-string v0, "\u06e8\u06e0\u06e8"

    move-object v1, v0

    move v9, v2

    goto/16 :goto_0

    :sswitch_10
    sget v2, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    const-string v0, "\u06e6\u06e8\u06e1"

    move-object v1, v0

    move v10, v2

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e6\u06df"

    move-object v8, v0

    goto/16 :goto_0

    :sswitch_12
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe5 -> :sswitch_2
        0xdc83 -> :sswitch_0
        0xdc9c -> :sswitch_e
        0xdcb9 -> :sswitch_b
        0x1aa782 -> :sswitch_a
        0x1aaf82 -> :sswitch_8
        0x1ab2c7 -> :sswitch_10
        0x1ab669 -> :sswitch_5
        0x1ab67f -> :sswitch_3
        0x1ab9e7 -> :sswitch_f
        0x1aba22 -> :sswitch_9
        0x1abac4 -> :sswitch_11
        0x1ac25f -> :sswitch_1
        0x1ac50c -> :sswitch_6
        0x1ac601 -> :sswitch_c
        0x1ac8f0 -> :sswitch_4
        0x1ac90c -> :sswitch_7
        0x1ac927 -> :sswitch_12
        0x1ac986 -> :sswitch_d
    .end sparse-switch
.end method

.method public downloadCommentImage(Landroid/content/Context;Ljava/lang/String;)V
    .locals 11

    const/4 v7, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e4\u06e1"

    move-object v4, v0

    move-object v3, v0

    move-object v5, v0

    move-object v6, v0

    move-object v8, v0

    move v9, v2

    move v10, v2

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e8\u06e2\u06e0"

    move-object v8, v0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e1\u06e7\u06e4"

    move-object v8, v0

    goto :goto_0

    :sswitch_1
    sget v2, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    const-string v0, "\u06e3\u06e7\u06e1"

    move-object v1, v0

    move v10, v2

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x5b9

    const/16 v1, 0xc63

    invoke-static {v8, v0, v9, v1}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v6

    const-string v0, "\u06e7\u06e0\u06e1"

    move-object v1, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v5, v7, v6}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "\u06e8\u06df\u06e5"

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    xor-int/lit16 v2, v10, 0x170

    const-string v0, "\u06e5\u06e5\u06df"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_5
    const/16 v0, 0x5bd

    const/16 v1, 0x995

    invoke-static {v8, v0, v9, v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v3

    const-string v0, "\u06e0\u06e2\u06e4"

    move-object v1, v0

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e7\u06df\u06e1"

    move-object v8, v0

    goto :goto_0

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e3\u06e2\u06e2"

    move-object v8, v0

    goto :goto_0

    :sswitch_8
    sget v2, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    const-string v0, "\u06df\u06e1\u06e6"

    move-object v1, v0

    move v10, v2

    goto :goto_0

    :sswitch_9
    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۥۢ۠ۧ()Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06df\u06e6\u06e5"

    move-object v1, v0

    goto :goto_0

    :sswitch_a
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->۟ۥ۠ۧۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    const-string v0, "\u06e5\u06e4"

    move-object v1, v0

    goto :goto_0

    :sswitch_b
    sget v2, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    const-string v0, "\u06e8\u06e8\u06e5"

    move-object v1, v0

    move v10, v2

    goto :goto_0

    :sswitch_c
    const/16 v0, 0x5ac

    const/16 v1, 0x78c

    invoke-static {v8, v0, v9, v1}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06e1\u06e5\u06e1"

    move-object v1, v0

    goto :goto_0

    :sswitch_d
    sget v2, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    const-string v0, "\u06e0\u06e2\u06e8"

    move-object v1, v0

    move v10, v2

    goto/16 :goto_0

    :sswitch_e
    xor-int/lit16 v2, v10, 0x326

    const-string v0, "\u06e5\u06e3"

    move-object v1, v0

    move v9, v2

    goto/16 :goto_0

    :sswitch_f
    const/16 v0, 0x5a8

    const/16 v1, 0x1d9

    invoke-static {v8, v0, v9, v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v6

    const-string v0, "\u06e7\u06e1\u06e3"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_10
    xor-int/lit8 v2, v10, -0x40

    const-string v0, "\u06df\u06e3\u06e1"

    move-object v1, v0

    move v9, v2

    goto/16 :goto_0

    :sswitch_11
    xor-int/lit16 v2, v10, 0x81

    const-string v0, "\u06e2\u06e4\u06e5"

    move-object v1, v0

    move v9, v2

    goto/16 :goto_0

    :sswitch_12
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc9e -> :sswitch_f
        0xdc9f -> :sswitch_12
        0x1aa744 -> :sswitch_10
        0x1aa77d -> :sswitch_5
        0x1aa7de -> :sswitch_0
        0x1aab22 -> :sswitch_a
        0x1aab26 -> :sswitch_e
        0x1aaf3d -> :sswitch_3
        0x1aaf7e -> :sswitch_1
        0x1ab2e3 -> :sswitch_c
        0x1ab663 -> :sswitch_b
        0x1ab6fd -> :sswitch_4
        0x1abe3f -> :sswitch_2
        0x1ac509 -> :sswitch_8
        0x1ac528 -> :sswitch_6
        0x1ac549 -> :sswitch_7
        0x1ac8ce -> :sswitch_9
        0x1ac926 -> :sswitch_d
        0x1ac9e5 -> :sswitch_11
    .end sparse-switch
.end method

.method public downloadCommentImageSilent(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x5c7

    sget v2, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v2, v2, -0x327

    const/16 v3, 0x4d6

    invoke-static {v0, v1, v2, v3}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x5cb

    sget v3, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v3, v3, 0x338

    const/16 v4, 0xa85

    invoke-static {v1, v2, v3, v4}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {p0, v1, v2, v0}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۥۢ۠ۧ()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x5d8

    sget v2, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v2, v2, -0x1ba

    const/16 v3, 0x310

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x5dc

    sget v2, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v2, v2, -0x216

    const/16 v3, 0x68d

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->۟ۥ۠ۧۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "Sue4dP6oMw7c8BTQbIW0l2Ev"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۤۡۧۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public downloadCommentLivePhoto(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 7

    const/4 v5, 0x1

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x5e6

    sget v2, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v2, v2, -0x112

    const/16 v3, 0xacb

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x5ea

    sget v3, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v3, v3, 0x43

    const/16 v4, 0x9c3

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, v5, v0}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-static/range {v0 .. v6}, Lkevin/fun/hook/download/DownloadManager;->ۡۡۦۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZZLjava/lang/Object;)V

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "mcYTz2eK8QwV"

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۡ۠ۢ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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

.method public downloadEmoji(Landroid/content/Context;Ljava/lang/String;)V
    .locals 13

    const/4 v2, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e6\u06e8"

    move-object v8, v0

    move-object v3, v0

    move-object v6, v0

    move-object v9, v0

    move-object v4, v0

    move-object v5, v0

    move-object v10, v0

    move v11, v2

    move v12, v2

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    sget v2, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    const-string v0, "\u06e4\u06e2\u06df"

    move-object v1, v0

    move v11, v2

    goto :goto_0

    :sswitch_0
    xor-int/lit16 v2, v11, -0x26d

    const-string v0, "\u06e3\u06e3\u06e0"

    move-object v1, v0

    move v12, v2

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e6\u06e4\u06e7"

    move-object v10, v0

    goto :goto_0

    :sswitch_2
    xor-int/lit8 v2, v11, -0x68

    const-string v0, "\u06e4\u06df\u06e2"

    move-object v1, v0

    move v12, v2

    goto :goto_0

    :sswitch_3
    sget v2, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    const-string v0, "\u06e2\u06e2\u06e6"

    move-object v1, v0

    move v11, v2

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e2\u06e5\u06e6"

    move-object v10, v0

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e4\u06e7\u06e1"

    move-object v10, v0

    goto :goto_0

    :sswitch_6
    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->۟ۥ۠ۧۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    const-string v0, "\u06e4\u06e2\u06e3"

    move-object v1, v0

    goto :goto_0

    :sswitch_7
    invoke-static {v9}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "\u06e5\u06e1\u06e1"

    move-object v1, v0

    goto :goto_0

    :sswitch_8
    sget v2, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    const-string v0, "\u06e2\u06e5\u06df"

    move-object v1, v0

    move v11, v2

    goto :goto_0

    :sswitch_9
    const/16 v0, 0x5fe

    const/16 v1, 0x443

    invoke-static {v10, v0, v12, v1}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v6

    const-string v0, "\u06e7\u06e8\u06e3"

    move-object v1, v0

    goto :goto_0

    :sswitch_a
    const/16 v0, 0x5f9

    const/16 v1, 0xaba

    invoke-static {v10, v0, v12, v1}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06e3\u06e6\u06e7"

    move-object v1, v0

    goto :goto_0

    :sswitch_b
    xor-int/lit16 v2, v11, -0x1ee

    const-string v0, "\u06e2\u06e8\u06e7"

    move-object v1, v0

    move v12, v2

    goto :goto_0

    :sswitch_c
    const/16 v0, 0x601

    const/16 v1, 0xaa0

    invoke-static {v10, v0, v12, v1}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v3

    const-string v0, "\u06e3\u06e2\u06e1"

    move-object v1, v0

    goto :goto_0

    :sswitch_d
    sget v2, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    const-string v0, "\u06e5\u06e3\u06e7"

    move-object v1, v0

    move v11, v2

    goto/16 :goto_0

    :sswitch_e
    xor-int/lit16 v2, v11, -0x1ef

    const-string v0, "\u06e5\u06e0"

    move-object v1, v0

    move v12, v2

    goto/16 :goto_0

    :sswitch_f
    const/16 v0, 0x5f4

    const/16 v1, 0xc12

    invoke-static {v10, v0, v12, v1}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06e0\u06df\u06e4"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_10
    invoke-static {v8, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u06e2\u06e6\u06e7"

    move-object v9, v0

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e8\u06e2\u06e0"

    move-object v10, v0

    goto/16 :goto_0

    :sswitch_12
    invoke-static {p0, v5}, Lkevin/fun/hook/download/DownloadManager;->ۨۧۡۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "\u06e7\u06e4\u06e2"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u06e2\u06e2\u06e5"

    move-object v9, v0

    goto/16 :goto_0

    :sswitch_14
    invoke-static {v9, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u06e8\u06e2\u06e5"

    move-object v8, v0

    goto/16 :goto_0

    :sswitch_15
    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۥۢ۠ۧ()Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06e7\u06e3\u06e5"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_16
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc9b -> :sswitch_a
        0x1aaac5 -> :sswitch_12
        0x1ab2a5 -> :sswitch_14
        0x1ab2a6 -> :sswitch_e
        0x1ab2fc -> :sswitch_0
        0x1ab303 -> :sswitch_8
        0x1ab323 -> :sswitch_7
        0x1ab361 -> :sswitch_c
        0x1ab662 -> :sswitch_6
        0x1ab680 -> :sswitch_9
        0x1ab6e4 -> :sswitch_10
        0x1ab6e5 -> :sswitch_11
        0x1ab9c7 -> :sswitch_f
        0x1aba21 -> :sswitch_b
        0x1aba25 -> :sswitch_16
        0x1abdc5 -> :sswitch_15
        0x1abe09 -> :sswitch_2
        0x1ac1e9 -> :sswitch_3
        0x1ac589 -> :sswitch_4
        0x1ac5a5 -> :sswitch_13
        0x1ac622 -> :sswitch_5
        0x1ac926 -> :sswitch_d
        0x1ac92b -> :sswitch_1
    .end sparse-switch
.end method

.method public downloadWorkCover(Landroid/content/Context;Ljava/lang/String;)V
    .locals 12

    const/4 v10, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06df\u06e5"

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    move-object v6, v0

    move-object v8, v0

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    const/16 v0, 0x60b

    const/16 v1, 0x44e

    invoke-static {v8, v0, v11, v1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v6

    const-string v0, "\u06e7\u06e5\u06e3"

    move-object v1, v0

    goto :goto_0

    :sswitch_0
    xor-int/lit16 v2, v9, 0x17b

    const-string v0, "\u06e7\u06e5\u06e1"

    move-object v1, v0

    move v11, v2

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e8\u06e2\u06df"

    move-object v8, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e4\u06e4\u06e8"

    move-object v8, v0

    goto :goto_0

    :sswitch_3
    sget v2, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    const-string v0, "\u06e6\u06df\u06e1"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_4
    xor-int/lit16 v2, v9, 0x263

    const-string v0, "\u06e2\u06e2"

    move-object v1, v0

    move v11, v2

    goto :goto_0

    :sswitch_5
    sget v2, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    const-string v0, "\u06e2\u06df\u06e3"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e1\u06e2\u06e4"

    move-object v8, v0

    goto :goto_0

    :sswitch_7
    sget v2, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    const-string v0, "\u06e4\u06e7\u06e2"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_8
    const/16 v0, 0x614

    const/16 v1, 0x766

    invoke-static {v8, v0, v11, v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v6

    const-string v0, "\u06e5\u06e8\u06df"

    move-object v1, v0

    goto :goto_0

    :sswitch_9
    const/16 v0, 0x616

    const/16 v1, 0xc7e

    invoke-static {v8, v0, v11, v1}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v3

    const-string v0, "\u06e7\u06e8\u06e2"

    move-object v1, v0

    goto :goto_0

    :sswitch_a
    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->۟ۥ۠ۧۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    const-string v0, "\u06e3\u06e2"

    move-object v1, v0

    goto :goto_0

    :sswitch_b
    xor-int/lit8 v2, v9, -0x17

    const-string v0, "\u06e7\u06e6\u06e5"

    move-object v1, v0

    move v11, v2

    goto :goto_0

    :sswitch_c
    const/16 v0, 0x60f

    const/16 v1, 0x9e3

    invoke-static {v8, v0, v11, v1}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06e5\u06e5\u06e7"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_d
    invoke-static {p0, v5, v10, v6}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "\u06e8\u06e0\u06df"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۦۨ۠ۦ()Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06e2\u06e6\u06e7"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e3\u06e1\u06e6"

    move-object v8, v0

    goto/16 :goto_0

    :sswitch_10
    sget v2, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    const-string v0, "\u06e3\u06e3\u06e5"

    move-object v1, v0

    move v9, v2

    goto/16 :goto_0

    :sswitch_11
    xor-int/lit16 v2, v9, 0x315

    const-string v0, "\u06e3\u06e6\u06e3"

    move-object v1, v0

    move v11, v2

    goto/16 :goto_0

    :sswitch_12
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc5f -> :sswitch_12
        0x1aaee3 -> :sswitch_7
        0x1ab246 -> :sswitch_b
        0x1ab248 -> :sswitch_2
        0x1ab323 -> :sswitch_6
        0x1ab648 -> :sswitch_5
        0x1ab685 -> :sswitch_11
        0x1ab6e0 -> :sswitch_9
        0x1aba68 -> :sswitch_3
        0x1ababf -> :sswitch_0
        0x1abe47 -> :sswitch_d
        0x1abe9c -> :sswitch_1
        0x1ac148 -> :sswitch_4
        0x1ac5c3 -> :sswitch_8
        0x1ac5c5 -> :sswitch_f
        0x1ac5e6 -> :sswitch_c
        0x1ac621 -> :sswitch_a
        0x1ac8e7 -> :sswitch_e
        0x1ac925 -> :sswitch_10
    .end sparse-switch
.end method

.method public downloadWorkImage(Landroid/content/Context;Ljava/lang/String;)V
    .locals 12

    const/4 v10, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e4\u06e2"

    move-object v3, v0

    move-object v4, v0

    move-object v6, v0

    move-object v5, v0

    move-object v8, v0

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->۟ۥ۠ۧۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    const-string v0, "\u06e5\u06e3\u06e5"

    move-object v1, v0

    goto :goto_0

    :sswitch_0
    sget v2, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    const-string v0, "\u06e1\u06e3\u06e4"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_1
    const/16 v0, 0x629

    const/16 v1, 0x4af

    invoke-static {v8, v0, v11, v1}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v6

    const-string v0, "\u06e7\u06e1\u06e8"

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x62b

    const/16 v1, 0x6fb

    invoke-static {v8, v0, v11, v1}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v3

    const-string v0, "\u06e0\u06e7\u06e2"

    move-object v1, v0

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v2, v9, -0xe7

    const-string v0, "\u06e6\u06e3\u06e6"

    move-object v1, v0

    move v11, v2

    goto :goto_0

    :sswitch_4
    sget v2, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    const-string v0, "\u06e6\u06e1\u06e3"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_5
    const/16 v0, 0x620

    const/16 v1, 0x2aa

    invoke-static {v8, v0, v11, v1}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v6

    const-string v0, "\u06e2\u06df\u06e2"

    move-object v1, v0

    goto :goto_0

    :sswitch_6
    xor-int/lit8 v2, v9, -0x61

    const-string v0, "\u06e2\u06e2\u06df"

    move-object v1, v0

    move v11, v2

    goto :goto_0

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e0\u06e0\u06e6"

    move-object v8, v0

    goto :goto_0

    :sswitch_8
    xor-int/lit16 v2, v9, -0x3a1

    const-string v0, "\u06e3\u06e4\u06e5"

    move-object v1, v0

    move v11, v2

    goto :goto_0

    :sswitch_9
    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۥۢ۠ۧ()Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06e2\u06df\u06e1"

    move-object v1, v0

    goto :goto_0

    :sswitch_a
    sget v2, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    const-string v0, "\u06e3\u06df\u06e5"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_b
    xor-int/lit8 v2, v9, -0x3f

    const-string v0, "\u06e2\u06e0\u06e8"

    move-object v1, v0

    move v11, v2

    goto :goto_0

    :sswitch_c
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e7\u06e3\u06e5"

    move-object v8, v0

    goto :goto_0

    :sswitch_d
    sget v2, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    const-string v0, "\u06e1\u06e6\u06e8"

    move-object v1, v0

    move v9, v2

    goto/16 :goto_0

    :sswitch_e
    const/16 v0, 0x624

    const/16 v1, 0x734

    invoke-static {v8, v0, v11, v1}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06e4\u06e5\u06e6"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e8\u06e0"

    move-object v8, v0

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e4\u06e7\u06e2"

    move-object v8, v0

    goto/16 :goto_0

    :sswitch_11
    invoke-static {p0, v5, v10, v6}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "\u06e1\u06e7\u06e8"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_12
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcf8 -> :sswitch_a
        0x1aaae6 -> :sswitch_d
        0x1aaf02 -> :sswitch_8
        0x1aaf63 -> :sswitch_b
        0x1aaf82 -> :sswitch_9
        0x1ab244 -> :sswitch_f
        0x1ab245 -> :sswitch_10
        0x1ab26a -> :sswitch_2
        0x1ab29f -> :sswitch_1
        0x1ab609 -> :sswitch_6
        0x1ab6a1 -> :sswitch_c
        0x1ab6a4 -> :sswitch_e
        0x1aba85 -> :sswitch_11
        0x1ababf -> :sswitch_0
        0x1abe07 -> :sswitch_12
        0x1ac188 -> :sswitch_3
        0x1ac1c9 -> :sswitch_5
        0x1ac54e -> :sswitch_7
        0x1ac589 -> :sswitch_4
    .end sparse-switch
.end method

.method public downloadWorkImageSilent(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8

    const/4 v7, 0x0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x635

    sget v2, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v2, v2, 0x257

    const/16 v3, 0x36f

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x639

    sget v3, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v3, v3, 0xf6

    const/16 v4, 0x7c6

    invoke-static {v1, v2, v3, v4}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, v7, v0}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۥۢ۠ۧ()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x63e

    sget v2, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v2, v2, 0x30f

    const/16 v3, 0x81c

    invoke-static {v0, v1, v2, v3}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x640

    sget v2, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v2, v2, -0x65

    const/16 v3, 0x50b

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->۟ۥ۠ۧۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "e6bGj5"

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۤۦۡۧ(Ljava/lang/String;)Ljava/lang/String;

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

.method public downloadWorkLivePhoto(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 12

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v6, 0x0

    const-string v3, "\u06df\u06e6\u06e4"

    move-object v7, v0

    move-object v8, v1

    move-object v9, v2

    move v10, v4

    move v11, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move/from16 v4, p4

    invoke-static/range {v0 .. v6}, Lkevin/fun/hook/download/DownloadManager;->ۡۡۦۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZZLjava/lang/Object;)V

    const-string v0, "\u06e4\u06e4\u06e1"

    move-object v3, v0

    goto :goto_0

    :sswitch_0
    const/16 v0, 0x64a

    const/16 v1, 0x7dc

    invoke-static {v9, v0, v11, v1}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e2\u06e0\u06e2"

    move-object v7, v0

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    sget v1, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    const-string v0, "\u06e2\u06e8\u06e6"

    move-object v3, v0

    move v10, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e6\u06e0\u06e6"

    move-object v9, v0

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v1, v10, 0x28e

    const-string v0, "\u06df\u06e5\u06e6"

    move-object v3, v0

    move v11, v1

    goto :goto_0

    :sswitch_4
    const/4 v0, 0x0

    invoke-static {p0, v8, v0, v7}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "\u06e2\u06e6\u06e2"

    move-object v3, v0

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v1, v10, -0x1f0

    const-string v0, "\u06e2\u06e7"

    move-object v3, v0

    move v11, v1

    goto :goto_0

    :sswitch_6
    const/16 v0, 0x64e

    const/16 v1, 0x990

    invoke-static {v9, v0, v11, v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e4\u06e2\u06e1"

    move-object v8, v0

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    sget v1, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    const-string v0, "\u06df\u06e4\u06e2"

    move-object v3, v0

    move v10, v1

    goto :goto_0

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e1\u06e6\u06e6"

    move-object v9, v0

    move-object v3, v1

    goto :goto_0

    :sswitch_9
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc45 -> :sswitch_0
        0x1aa79d -> :sswitch_3
        0x1aa7c0 -> :sswitch_6
        0x1aa7dd -> :sswitch_2
        0x1aaf61 -> :sswitch_7
        0x1ab264 -> :sswitch_8
        0x1ab360 -> :sswitch_5
        0x1aba23 -> :sswitch_4
        0x1aba61 -> :sswitch_9
        0x1ac16c -> :sswitch_1
    .end sparse-switch
.end method

.method public downloadWorkMusic(Landroid/content/Context;Ljava/lang/String;)V
    .locals 12

    const/4 v10, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e2\u06e8"

    move-object v4, v0

    move-object v3, v0

    move-object v5, v0

    move-object v6, v0

    move-object v8, v0

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    sget v2, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    const-string v0, "\u06e5\u06e8\u06e0"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_0
    xor-int/lit16 v2, v9, -0x25e

    const-string v0, "\u06e7\u06e6\u06e0"

    move-object v1, v0

    move v11, v2

    goto :goto_0

    :sswitch_1
    const/16 v0, 0x65c

    const/16 v1, 0x38f

    invoke-static {v8, v0, v11, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06e4\u06e0\u06e6"

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p0, v5, v10, v6}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "\u06e6\u06e5\u06e6"

    move-object v1, v0

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v2, v9, 0x117

    const-string v0, "\u06e6\u06df\u06e8"

    move-object v1, v0

    move v11, v2

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e0\u06e6\u06e3"

    move-object v8, v0

    goto :goto_0

    :sswitch_5
    sget v2, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    const-string v0, "\u06e3\u06e0\u06e7"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_6
    const/16 v0, 0x663

    const/16 v1, 0x8a1

    invoke-static {v8, v0, v11, v1}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v3

    const-string v0, "\u06e3\u06e4\u06e6"

    move-object v1, v0

    goto :goto_0

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e8\u06e4\u06e4"

    move-object v8, v0

    goto :goto_0

    :sswitch_8
    sget v2, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    const-string v0, "\u06e0\u06e3\u06e4"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_9
    const/16 v0, 0x658

    const/16 v1, 0x1b7

    invoke-static {v8, v0, v11, v1}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v6

    const-string v0, "\u06e3\u06e2\u06e4"

    move-object v1, v0

    goto :goto_0

    :sswitch_a
    xor-int/lit16 v2, v9, 0x327

    const-string v0, "\u06e7\u06e4\u06e7"

    move-object v1, v0

    move v11, v2

    goto :goto_0

    :sswitch_b
    sget v2, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    const-string v0, "\u06e8\u06e3\u06df"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_c
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e0\u06e1\u06e2"

    move-object v8, v0

    goto :goto_0

    :sswitch_d
    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۤۢۢ()Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06e1\u06e2\u06e7"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_e
    xor-int/lit16 v2, v9, 0x251

    const-string v0, "\u06e2\u06e0\u06e2"

    move-object v1, v0

    move v11, v2

    goto/16 :goto_0

    :sswitch_f
    const/16 v0, 0x661

    const/16 v1, 0x4ec

    invoke-static {v8, v0, v11, v1}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v6

    const-string v0, "\u06e4\u06e0\u06e8"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e3\u06e2\u06e1"

    move-object v8, v0

    goto/16 :goto_0

    :sswitch_11
    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->۟ۥ۠ۧۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    const-string v0, "\u06df\u06e5\u06e8"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_12
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7c2 -> :sswitch_12
        0x1aab01 -> :sswitch_b
        0x1aab41 -> :sswitch_a
        0x1aaee6 -> :sswitch_c
        0x1ab264 -> :sswitch_f
        0x1ab2a8 -> :sswitch_4
        0x1ab62a -> :sswitch_3
        0x1ab662 -> :sswitch_8
        0x1ab665 -> :sswitch_10
        0x1ab6a5 -> :sswitch_11
        0x1ab9ea -> :sswitch_2
        0x1ab9ec -> :sswitch_7
        0x1abe9d -> :sswitch_0
        0x1ac14f -> :sswitch_6
        0x1ac207 -> :sswitch_d
        0x1ac5aa -> :sswitch_1
        0x1ac5e1 -> :sswitch_9
        0x1ac944 -> :sswitch_e
        0x1ac968 -> :sswitch_5
    .end sparse-switch
.end method

.method public downloadWorkVideo(Landroid/content/Context;Ljava/lang/String;)V
    .locals 12

    const/4 v10, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e0\u06df"

    move-object v3, v0

    move-object v4, v0

    move-object v6, v0

    move-object v5, v0

    move-object v8, v0

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    xor-int/lit8 v2, v9, 0x76

    const-string v0, "\u06df\u06e6"

    move-object v1, v0

    move v11, v2

    goto :goto_0

    :sswitch_0
    sget v2, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    const-string v0, "\u06e7\u06e1\u06e6"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_1
    sget v2, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    const-string v0, "\u06e3\u06e5\u06e1"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v2, v9, -0x1b9

    const-string v0, "\u06e6\u06df\u06e4"

    move-object v1, v0

    move v11, v2

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06df\u06e0"

    move-object v8, v0

    goto :goto_0

    :sswitch_4
    const/16 v0, 0x66c

    const/16 v1, 0x64f

    invoke-static {v8, v0, v11, v1}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v6

    const-string v0, "\u06e0\u06e4\u06e0"

    move-object v1, v0

    goto :goto_0

    :sswitch_5
    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->۟ۥ۠ۧۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    const-string v0, "\u06e4\u06df\u06e7"

    move-object v1, v0

    goto :goto_0

    :sswitch_6
    sget v2, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    const-string v0, "\u06df\u06e5\u06e0"

    move-object v1, v0

    move v9, v2

    goto :goto_0

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e2\u06e7\u06df"

    move-object v8, v0

    goto :goto_0

    :sswitch_8
    const/16 v0, 0x670

    const/16 v1, 0x5c4

    invoke-static {v8, v0, v11, v1}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06e6\u06e3\u06df"

    move-object v1, v0

    goto :goto_0

    :sswitch_9
    xor-int/lit16 v2, v9, 0x117

    const-string v0, "\u06e7\u06e1\u06e0"

    move-object v1, v0

    move v11, v2

    goto :goto_0

    :sswitch_a
    invoke-static {p0, v5, v10, v6}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "\u06e6\u06e1"

    move-object v1, v0

    goto :goto_0

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e4\u06e3\u06df"

    move-object v8, v0

    goto :goto_0

    :sswitch_c
    const/16 v0, 0x675

    const/16 v1, 0x1e2

    invoke-static {v8, v0, v11, v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v6

    const-string v0, "\u06e7\u06e2\u06e5"

    move-object v1, v0

    goto :goto_0

    :sswitch_d
    sget v2, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    const-string v0, "\u06e4\u06df\u06e0"

    move-object v1, v0

    move v9, v2

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۦۨ۠ۦ()Ljava/lang/String;

    move-result-object v5

    const-string v0, "\u06e0\u06df\u06e1"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_f
    const/16 v0, 0x677

    const/16 v1, 0x373

    invoke-static {v8, v0, v11, v1}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v3

    const-string v0, "\u06e1\u06e3\u06df"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const-string v1, "\u06e7\u06e3\u06e6"

    move-object v8, v0

    goto/16 :goto_0

    :sswitch_11
    xor-int/lit8 v2, v9, -0x78

    const-string v0, "\u06e4\u06e4\u06e3"

    move-object v1, v0

    move v11, v2

    goto/16 :goto_0

    :sswitch_12
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe1 -> :sswitch_1
        0xdbe7 -> :sswitch_4
        0xdcbb -> :sswitch_e
        0x1aaac2 -> :sswitch_b
        0x1aab5c -> :sswitch_3
        0x1aaefd -> :sswitch_5
        0x1ab33a -> :sswitch_0
        0x1ab6bf -> :sswitch_2
        0x1ab9c5 -> :sswitch_11
        0x1ab9cc -> :sswitch_12
        0x1aba40 -> :sswitch_d
        0x1aba63 -> :sswitch_c
        0x1ac14b -> :sswitch_8
        0x1ac1c2 -> :sswitch_a
        0x1ac546 -> :sswitch_f
        0x1ac54c -> :sswitch_9
        0x1ac56a -> :sswitch_7
        0x1ac58a -> :sswitch_6
        0x1ac8e7 -> :sswitch_10
    .end sparse-switch
.end method

.method public downloadWorkVideoSilent(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8

    const/4 v7, 0x0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x680

    sget v2, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v2, v2, 0x162

    const/16 v3, 0x21f

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x684

    sget v3, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v3, v3, 0x57

    const/16 v4, 0xab8

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, v7, v0}, Lkevin/fun/hook/download/DownloadManager;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۦۨ۠ۦ()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x689

    sget v2, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v2, v2, -0x1e6

    const/16 v3, 0x628

    invoke-static {v0, v1, v2, v3}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x68b

    sget v2, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v2, v2, 0x352

    const/16 v3, 0x532

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->۟ۥ۠ۧۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "ntCoFQBDZrN"

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۡۢۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public getBatchManager()Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;
    .locals 1

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    return-object v0
.end method

.method synthetic lambda$0$kevin-fun-hook-download-DownloadManager(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۢۡۧۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method synthetic lambda$1$kevin-fun-hook-download-DownloadManager(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    :try_start_0
    invoke-static {p0, p1, p2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۦۦ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۠ۢۧۡ;->۠۠ۨۦ(Ljava/lang/Object;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

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

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x694

    sget v4, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v4, v4, -0x76

    const/16 v5, 0xa9a

    invoke-static {v2, v3, v4, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/download/DownloadManager;->ۡۨ۟(Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۠ۢۧۡ;->۠۠ۨۦ(Ljava/lang/Object;Z)V

    goto :goto_1

    :cond_0
    :sswitch_3
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_4
    const-string v0, "vVfEUg6MdF58UFd9Vmml8jCD0tZ"

    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۣۢ۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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

.method synthetic lambda$10$kevin-fun-hook-download-DownloadManager(ZLandroid/content/Context;)V
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
    if-eqz p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x6af

    sget v2, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v2, v2, 0x38e

    const/16 v3, 0x424

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

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
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x6bb

    sget v2, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v2, v2, -0x256

    const/16 v3, 0xbcf

    invoke-static {v0, v1, v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v0

    :sswitch_5
    invoke-static {p0, p2, v0}, Lkevin/fun/hook/download/DownloadManager;->۟۠۟ۧۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

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
.end method

.method synthetic lambda$11$kevin-fun-hook-download-DownloadManager(ZLandroid/content/Context;Ljava/lang/String;)V
    .locals 7

    const/4 v6, 0x1

    const/16 v0, 0x650

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
    :try_start_0
    invoke-static {p0, p2, p3}, Lkevin/fun/hook/download/DownloadManager;->۟ۦۢ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {p0, p2, p3}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۥ۟ۡ(Ljava/lang/Object;)Z

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
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {v0, v6}, Landroidx/lifecycle/process/۠ۢۧۡ;->۠۠ۨۦ(Ljava/lang/Object;Z)V

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    return-void

    :sswitch_a
    const v0, 0xbe9e

    goto :goto_3

    :catchall_0
    move-exception v0

    const v1, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :sswitch_b
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v1

    invoke-static {v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۥ۟ۡ(Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xc2fa

    :goto_5
    const v3, 0xc30b

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_5

    goto :goto_5

    :sswitch_c
    if-eqz v2, :cond_3

    const v1, 0xc5e2

    goto :goto_5

    :sswitch_d
    const v1, 0xbf1a

    goto :goto_4

    :catch_0
    move-exception v0

    :try_start_1
    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x6c7

    sget v4, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v4, v4, 0x315

    const/16 v5, 0xc62

    invoke-static {v2, v3, v4, v5}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/download/DownloadManager;->ۡۨ۟(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۥ۟ۡ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :sswitch_e
    if-eqz v1, :cond_2

    const v0, 0xc25f

    goto :goto_6

    :cond_2
    :sswitch_f
    const v0, 0xc240

    goto :goto_6

    :sswitch_10
    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_11
    const v0, 0xc29d

    goto :goto_7

    :cond_3
    :sswitch_12
    const v1, 0xc5c3

    goto :goto_5

    :sswitch_13
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v1

    invoke-static {v1, v6}, Landroidx/lifecycle/process/۠ۢۧۡ;->۠۠ۨۦ(Ljava/lang/Object;Z)V

    :sswitch_14
    throw v0

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
        0xb918 -> :sswitch_9
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
        0x16 -> :sswitch_b
        0x1f7 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x1f1 -> :sswitch_c
        0x6af -> :sswitch_12
        0x6c8 -> :sswitch_14
        0x6e9 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_f
        0x4c -> :sswitch_10
        0x53 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_8
        0xf1 -> :sswitch_11
    .end sparse-switch
.end method

.method synthetic lambda$12$kevin-fun-hook-download-DownloadManager(ZLandroid/content/Context;Ljava/lang/String;)V
    .locals 7

    const/4 v6, 0x1

    const/16 v0, 0x650

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
    :try_start_0
    invoke-static {p0, p2, p3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۦۦ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {p0, p2, p3}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۢۡۧۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۥ۟ۡ(Ljava/lang/Object;)Z

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
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {v0, v6}, Landroidx/lifecycle/process/۠ۢۧۡ;->۠۠ۨۦ(Ljava/lang/Object;Z)V

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

    move-result v1

    const v0, 0xc2fa

    :goto_4
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_a
    if-ltz v1, :cond_3

    const v0, 0xc5e2

    goto :goto_4

    :sswitch_b
    const v0, 0xbe9e

    goto :goto_3

    :catchall_0
    move-exception v0

    const v1, 0xbefb

    :goto_5
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_5

    goto :goto_5

    :sswitch_c
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v1

    invoke-static {v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۥ۟ۡ(Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xc601

    :goto_6
    const v3, 0xc612

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_6

    goto :goto_6

    :sswitch_d
    if-eqz v2, :cond_4

    const v1, 0xc65e

    goto :goto_6

    :sswitch_e
    const v1, 0xbf1a

    goto :goto_5

    :catch_0
    move-exception v0

    :try_start_1
    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x6df

    sget v4, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v4, v4, 0x13e

    const/16 v5, 0xc69

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/download/DownloadManager;->ۡۨ۟(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۥ۟ۡ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc202

    :goto_7
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_f
    if-eqz v1, :cond_2

    const v0, 0xc25f

    goto :goto_7

    :cond_2
    :sswitch_10
    const v0, 0xc240

    goto :goto_7

    :sswitch_11
    const v0, 0xc27e

    :goto_8
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_8

    :sswitch_12
    const v0, 0xc29d

    goto :goto_8

    :cond_3
    :sswitch_13
    const v0, 0xc5c3

    goto/16 :goto_4

    :sswitch_14
    const-string v0, "gmB5B47qtQO"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۧۦۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_15
    return-void

    :cond_4
    :sswitch_16
    const v1, 0xc63f

    goto :goto_6

    :sswitch_17
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v1

    invoke-static {v1, v6}, Landroidx/lifecycle/process/۠ۢۧۡ;->۠۠ۨۦ(Ljava/lang/Object;Z)V

    :sswitch_18
    throw v0

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
        0xb918 -> :sswitch_9
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
        0x1f1 -> :sswitch_a
        0x6af -> :sswitch_13
        0x6c8 -> :sswitch_15
        0x6e9 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x13 -> :sswitch_d
        0x2d -> :sswitch_18
        0x32 -> :sswitch_16
        0x4c -> :sswitch_17
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x12 -> :sswitch_8
        0xf1 -> :sswitch_12
    .end sparse-switch
.end method

.method synthetic lambda$13$kevin-fun-hook-download-DownloadManager(ZLandroid/content/Context;)V
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
    if-eqz p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x6f7

    sget v2, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v2, v2, -0x256

    const/16 v3, 0x305

    invoke-static {v0, v1, v2, v3}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

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
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x703

    sget v2, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v2, v2, -0x6f

    const/16 v3, 0x921

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v0

    :sswitch_5
    invoke-static {p0, p2, v0}, Lkevin/fun/hook/download/DownloadManager;->۟۠۟ۧۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

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
.end method

.method synthetic lambda$15$kevin-fun-hook-download-DownloadManager(Landroid/content/Context;ILjava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const-string v1, "\u06e6\u06e2\u06e6"

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    const-string v1, "\u06e1\u06e0\u06df"

    goto :goto_0

    :sswitch_0
    invoke-static {v0, p1, p2, p3}, Landroidx/viewpager/ۣۢ۟ۤ;->۠ۥۣۤ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    const-string v1, "\u06e8\u06df\u06e6"

    goto :goto_0

    :sswitch_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaea0 -> :sswitch_0
        0x1ac8cf -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic lambda$2$kevin-fun-hook-download-DownloadManager(Ljava/lang/ref/WeakReference;[Landroid/app/Dialog;Ljava/lang/String;Ljava/lang/String;[Z[Z[Lokhttp3/Call;[Landroid/net/Uri;Landroid/content/Context;[Landroid/widget/TextView;[Landroid/widget/ProgressBar;[Landroid/widget/TextView;)V
    .locals 12

    invoke-static {p1}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/content/Context;

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
    if-nez v10, :cond_0

    const/16 v3, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->۟۠ۨۢۡ()I

    move-result v4

    const/16 v3, 0x6cc

    :goto_1
    xor-int/lit16 v3, v3, 0x6dd

    sparse-switch v3, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-gtz v4, :cond_1

    const/16 v3, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v3, 0x70a

    goto :goto_1

    :sswitch_5
    const-string v3, "iYNUGLldEcRKeqqGul"

    invoke-static {v3}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۧۦۦۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v4, v3}, Ljava/io/PrintStream;->println(I)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    const/4 v3, 0x0

    move-object/from16 v0, p4

    invoke-static {p0, v10, p3, v0}, Lkevin/fun/hook/download/DownloadManager;->ۣ۟ۢۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v4

    aput-object v4, p2, v3

    const/4 v3, 0x0

    aget-object v3, p2, v3

    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۦۧۤۡ(Ljava/lang/Object;)V

    const/4 v3, 0x0

    aget-object v3, p2, v3

    invoke-static {v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨۥۢ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v3

    invoke-static {v3}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۦۢ۟(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۤۢ۠ۤ()I

    move-result v3

    invoke-static {v4, v3}, Landroidx/core/ۤۦ۟ۢ;->ۥۧ۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۣۤ۠ۦ()I

    move-result v5

    invoke-static {v4, v5}, Landroidx/core/ۤۦ۟ۢ;->ۥۧ۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Landroid/view/View;

    const/16 v4, 0x748

    :goto_3
    xor-int/lit16 v4, v4, 0x759

    sparse-switch v4, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-eqz v3, :cond_2

    const v4, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v4, 0xbe41

    goto :goto_3

    :sswitch_a
    new-instance v4, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda4;

    move-object/from16 v0, p5

    invoke-direct {v4, p0, v0, p2, v10}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda4;-><init>(Lkevin/fun/hook/download/DownloadManager;[Z[Landroid/app/Dialog;Landroid/content/Context;)V

    invoke-static {v3, v4}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۥۥ۟۠(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_b
    const v3, 0xbe7f

    :goto_4
    const v4, 0xbe90

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_c
    const v3, 0xbebd

    goto :goto_4

    :sswitch_d
    if-eqz v11, :cond_3

    const v3, 0xbedc

    goto :goto_4

    :sswitch_e
    new-instance v3, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda5;

    move-object v4, p0

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object v9, p2

    invoke-direct/range {v3 .. v10}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda5;-><init>(Lkevin/fun/hook/download/DownloadManager;[Z[Lokhttp3/Call;[Landroid/net/Uri;Landroid/content/Context;[Landroid/app/Dialog;Landroid/content/Context;)V

    invoke-static {v11, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۥۥ۟۠(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_f
    const/4 v3, 0x0

    aget-object v3, p2, v3

    invoke-static {v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨۥۢ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v3

    invoke-static {v3}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۦۢ۟(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v3

    move-object/from16 v0, p10

    move-object/from16 v1, p11

    move-object/from16 v2, p12

    invoke-static {p0, v3, v0, v1, v2}, Lkevin/fun/hook/download/DownloadManager;->۟ۦۣۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_2

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
        0x2d -> :sswitch_f
        0x4c -> :sswitch_e
        0xef -> :sswitch_d
    .end sparse-switch
.end method

.method synthetic lambda$3$kevin-fun-hook-download-DownloadManager([Z[Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V
    .locals 4

    const/4 v2, 0x0

    const/4 v0, 0x1

    aput-boolean v0, p1, v2

    aget-object v1, p2, v2

    const/16 v0, 0x650

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
    aget-object v0, p2, v2

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۤۥۣۡ(Ljava/lang/Object;)Z

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
    aget-object v0, p2, v2

    invoke-static {v0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x70f

    sget v2, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v2, v2, 0x2

    const/16 v3, 0xb7b

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p3, v0}, Lkevin/fun/hook/download/DownloadManager;->۟۠۟ۧۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

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
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$4$kevin-fun-hook-download-DownloadManager([Z[Lokhttp3/Call;[Landroid/net/Uri;Landroid/content/Context;[Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V
    .locals 5

    const/4 v4, 0x0

    const/4 v0, 0x1

    aput-boolean v0, p1, v4

    aget-object v1, p2, v4

    const/16 v0, 0x650

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
    aget-object v0, p2, v4

    invoke-static {v0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۨۧ(Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۦۧۦۦ(Ljava/lang/Object;)V

    aget-object v1, p3, v4

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
    aget-object v0, p3, v4

    invoke-static {p0, p4, v0}, Lkevin/fun/hook/download/DownloadManager;->ۥۨۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_7
    aget-object v1, p5, v4

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
    aget-object v0, p5, v4

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۤۥۣۡ(Ljava/lang/Object;)Z

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
    if-eqz v1, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_d
    aget-object v0, p5, v4

    invoke-static {v0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v0

    const/16 v1, 0x720

    sget v2, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v2, v2, 0x256

    const/16 v3, 0xa1a

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p6, v0}, Lkevin/fun/hook/download/DownloadManager;->۟ۦۣۦ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۥ۟ۡ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_f
    const v0, 0xbf39

    goto :goto_4

    :sswitch_10
    if-eqz v1, :cond_4

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_11
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {v0, v4}, Landroidx/lifecycle/process/۠ۢۧۡ;->۠۠ۨۦ(Ljava/lang/Object;Z)V

    :sswitch_12
    invoke-static {}, Lorg/luckypray/dexkit/۠۠ۥ;->ۡۥ۠ۦ()I

    move-result v1

    const v0, 0xc202

    :goto_5
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_13
    if-ltz v1, :cond_5

    const v0, 0xc25f

    goto :goto_5

    :cond_5
    :sswitch_14
    const v0, 0xc240

    goto :goto_5

    :sswitch_15
    const-string v0, "XfNT8pMK"

    invoke-static {v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۧۢ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_16
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
        0x2d -> :sswitch_e
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_f
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_10
        0x7eef -> :sswitch_11
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_13
        0x32 -> :sswitch_14
        0x4c -> :sswitch_15
        0x53 -> :sswitch_16
    .end sparse-switch
.end method

.method synthetic lambda$5$kevin-fun-hook-download-DownloadManager([ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;[Landroid/net/Uri;[Lokhttp3/Call;Z[Z[Landroid/app/Dialog;[Landroid/widget/TextView;[Landroid/widget/ProgressBar;[Landroid/widget/TextView;JLjava/lang/String;)V
    .locals 20

    const/4 v4, 0x0

    :try_start_0
    aget-boolean v5, p1, v4

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
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v4

    invoke-static {v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۥ۟ۡ(Ljava/lang/Object;)Z

    move-result v5

    const/16 v4, 0x6cc

    :goto_1
    xor-int/lit16 v4, v4, 0x6dd

    sparse-switch v4, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v5, :cond_1

    const/16 v4, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v4, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Landroidx/lifecycle/process/۠ۢۧۡ;->۠۠ۨۦ(Ljava/lang/Object;Z)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    invoke-static {v0, v1, v2}, Lkevin/fun/hook/download/DownloadManager;->ۣۢۡ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p2

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p4

    invoke-static {v0, v1, v4, v2}, Lkevin/fun/hook/download/DownloadManager;->۟ۧ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v18

    const/4 v4, 0x0

    aput-object v18, p6, v4

    new-instance v4, Lkevin/fun/hook/download/DownloadManager$1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    move-object/from16 v5, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-wide/from16 v14, p14

    move-object/from16 v16, p5

    move-object/from16 v17, p2

    :try_start_1
    invoke-direct/range {v4 .. v17}, Lkevin/fun/hook/download/DownloadManager$1;-><init>(Lkevin/fun/hook/download/DownloadManager;[Z[Lokhttp3/Call;Z[Z[Landroid/app/Dialog;[Landroid/widget/TextView;[Landroid/widget/ProgressBar;[Landroid/widget/TextView;JLandroid/content/Context;Ljava/lang/String;)V

    move-object/from16 v5, p0

    move-object/from16 v6, p5

    move-object/from16 v7, p3

    move-object/from16 v8, v18

    move-object v9, v4

    move-object/from16 v10, p7

    invoke-static/range {v5 .. v10}, Lkevin/fun/hook/download/DownloadManager;->ۣۡۡۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v4, 0x0

    aget-boolean v5, p1, v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    const/16 v4, 0x748

    :goto_3
    xor-int/lit16 v4, v4, 0x759

    sparse-switch v4, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-eqz v5, :cond_2

    const v4, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v4, 0xbe41

    goto :goto_3

    :sswitch_a
    const/4 v4, 0x0

    aget-object v5, p6, v4

    const v4, 0xbe7f

    :goto_4
    const v6, 0xbe90

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_b
    const v4, 0xbebd

    goto :goto_4

    :sswitch_c
    if-eqz v5, :cond_3

    const v4, 0xbedc

    goto :goto_4

    :sswitch_d
    const/4 v4, 0x0

    aget-object v4, p6, v4

    :try_start_2
    move-object/from16 v0, p0

    move-object/from16 v1, p5

    invoke-static {v0, v1, v4}, Lkevin/fun/hook/download/DownloadManager;->ۥۨۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const v4, 0xbefb

    :goto_5
    const v5, 0xbf0c

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_4

    goto :goto_5

    :sswitch_e
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v4

    invoke-static {v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۥ۟ۡ(Ljava/lang/Object;)Z

    move-result v5

    const v4, 0xc202

    :goto_6
    const v6, 0xc213

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    if-eqz v5, :cond_4

    const v4, 0xc25f

    goto :goto_6

    :sswitch_10
    const v4, 0xbf1a

    goto :goto_5

    :cond_4
    :sswitch_11
    const v4, 0xc240

    goto :goto_6

    :sswitch_12
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Landroidx/lifecycle/process/۠ۢۧۡ;->۠۠ۨۦ(Ljava/lang/Object;Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception v4

    const v5, 0xc27e

    :goto_7
    const v6, 0xc28f

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_6

    goto :goto_7

    :sswitch_13
    const v5, 0xc2fa

    :goto_8
    const v6, 0xc30b

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_7

    goto :goto_8

    :sswitch_14
    const v5, 0xc5a4

    goto :goto_8

    :sswitch_15
    const v5, 0xc29d

    goto :goto_7

    :sswitch_16
    const v4, 0xc601

    :goto_9
    const v5, 0xc612

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_8

    goto :goto_9

    :sswitch_17
    if-eqz p8, :cond_5

    const v4, 0xc65e

    goto :goto_9

    :cond_5
    :sswitch_18
    const v4, 0xc63f

    goto :goto_9

    :sswitch_19
    const/4 v4, 0x0

    :try_start_3
    aget-boolean v5, p9, v4

    const v4, 0xc67d

    :goto_a
    const v6, 0xc68e

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_9

    goto :goto_a

    :cond_6
    :sswitch_1a
    const v4, 0xc6bb

    goto :goto_a

    :sswitch_1b
    if-nez v5, :cond_6

    const v4, 0xc965

    goto :goto_a

    :sswitch_1c
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۦۡۦۧ()Landroid/os/Handler;

    move-result-object v4

    new-instance v5, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda10;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :try_start_4
    move-object/from16 v0, p0

    move-object/from16 v1, p10

    move-object/from16 v2, p5

    move-object/from16 v3, p16

    invoke-direct {v5, v0, v1, v2, v3}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda10;-><init>(Lkevin/fun/hook/download/DownloadManager;[Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v4, v5}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v4, 0xc984

    :goto_b
    const v5, 0xc995

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_a

    goto :goto_b

    :sswitch_1d
    const v4, 0xc9a3

    goto :goto_b

    :catch_1
    move-exception v4

    const v5, 0xca00

    :goto_c
    const v6, 0xca11

    xor-int/2addr v5, v6

    packed-switch v5, :pswitch_data_0

    :pswitch_0
    goto :goto_c

    :goto_d
    :pswitch_1
    const v5, 0xd505

    :goto_e
    const v6, 0xd516

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_b

    goto :goto_e

    :sswitch_1e
    const v5, 0xd524

    goto :goto_e

    :pswitch_2
    const v5, 0xca1f

    goto :goto_c

    :sswitch_1f
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۦۡۦۧ()Landroid/os/Handler;

    move-result-object v4

    new-instance v5, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda11;

    move-object/from16 v0, p10

    invoke-direct {v5, v0}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda11;-><init>([Landroid/app/Dialog;)V

    invoke-static {v4, v5}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v4

    invoke-static {v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۥ۟ۡ(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7

    move-result v5

    const v4, 0xca7c

    :goto_f
    const v6, 0xca8d

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_c

    goto :goto_f

    :sswitch_20
    if-eqz v5, :cond_7

    const v4, 0xcd64

    goto :goto_f

    :cond_7
    :sswitch_21
    const v4, 0xcd45

    goto :goto_f

    :sswitch_22
    :try_start_5
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6

    move-result-object v4

    const/4 v5, 0x1

    :try_start_6
    invoke-static {v4, v5}, Landroidx/lifecycle/process/۠ۢۧۡ;->۠۠ۨۦ(Ljava/lang/Object;Z)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    const v4, 0xcd83

    :goto_10
    const v5, 0xcd94

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_d

    goto :goto_10

    :sswitch_23
    const v4, 0xcda2

    goto :goto_10

    :catch_2
    move-exception v4

    const v5, 0xcdff

    :goto_11
    const v6, 0xce10

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_e

    goto :goto_11

    :goto_12
    :sswitch_24
    const v5, 0xd106

    :goto_13
    const v6, 0xd117

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_f

    goto :goto_13

    :sswitch_25
    const v5, 0xd125

    goto :goto_13

    :sswitch_26
    const v5, 0xce1e

    goto :goto_11

    :sswitch_27
    const/4 v4, 0x1

    :try_start_7
    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p2

    invoke-static {v0, v1, v2, v4}, Lkevin/fun/hook/download/DownloadManager;->ۢۢۦ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    const v4, 0xd182

    :goto_14
    const v5, 0xd193

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_10

    goto :goto_14

    :sswitch_28
    const v4, 0xd1a1

    goto :goto_14

    :catch_3
    move-exception v4

    const v5, 0xd1fe

    :goto_15
    const v6, 0xd20f

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_11

    goto :goto_15

    :sswitch_29
    const v5, 0xd4a8

    goto :goto_15

    :catch_4
    move-exception v4

    :sswitch_2a
    const v5, 0xd581

    :goto_16
    const v6, 0xd592

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_12

    goto :goto_16

    :sswitch_2b
    const v5, 0xd5a0

    goto :goto_16

    :catch_5
    move-exception v4

    :sswitch_2c
    invoke-static {v4}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const/4 v4, 0x0

    aget-boolean v5, p1, v4

    const v4, 0xd888

    :goto_17
    const v6, 0xd899

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_13

    goto :goto_17

    :sswitch_2d
    if-nez v5, :cond_8

    const v4, 0xd8e5

    goto :goto_17

    :cond_8
    :sswitch_2e
    const v4, 0xd8c6

    goto :goto_17

    :sswitch_2f
    const v4, 0xd904

    :goto_18
    const v5, 0xd915

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_14

    goto :goto_18

    :sswitch_30
    if-eqz v9, :cond_9

    const v4, 0xd961

    goto :goto_18

    :cond_9
    :sswitch_31
    const v4, 0xd942

    goto :goto_18

    :sswitch_32
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x725

    sget v6, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v6, v6, 0x157

    const/16 v7, 0x7d7

    invoke-static {v4, v5, v6, v7}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v9, v4}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v4, 0xd980

    :goto_19
    const v6, 0xd991

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_15

    goto :goto_19

    :sswitch_33
    if-nez v5, :cond_a

    const v4, 0xdc68

    goto :goto_19

    :cond_a
    :sswitch_34
    const v4, 0xdc49

    goto :goto_19

    :sswitch_35
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v4

    const/16 v5, 0x72d

    sget v6, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v6, v6, 0x25e

    const/16 v7, 0x4ee

    invoke-static {v4, v5, v6, v7}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v9, v4}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v4, 0xdc87

    :goto_1a
    const v6, 0xdc98

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_16

    goto :goto_1a

    :sswitch_36
    if-nez v5, :cond_b

    const v4, 0xdce4

    goto :goto_1a

    :cond_b
    :sswitch_37
    const v4, 0xdcc5

    goto :goto_1a

    :sswitch_38
    const/4 v7, 0x0

    const v4, 0xdd03

    :goto_1b
    const v5, 0xdd14

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_17

    goto :goto_1b

    :sswitch_39
    const v4, 0xdd22

    goto :goto_1b

    :sswitch_3a
    const/4 v7, 0x1

    :sswitch_3b
    const v4, 0x1700af

    :goto_1c
    const v5, 0x1700c0

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_18

    goto :goto_1c

    :cond_c
    :sswitch_3c
    const v4, 0x1700ed

    goto :goto_1c

    :sswitch_3d
    if-eqz v7, :cond_c

    const v4, 0x17010c

    goto :goto_1c

    :sswitch_3e
    const/4 v4, 0x0

    aget-object v5, p6, v4

    const v4, 0x17012b

    :goto_1d
    const v6, 0x17013c

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_19

    goto :goto_1d

    :sswitch_3f
    if-eqz v5, :cond_d

    const v4, 0x170188

    goto :goto_1d

    :cond_d
    :sswitch_40
    const v4, 0x170169

    goto :goto_1d

    :sswitch_41
    const/4 v4, 0x0

    aget-object v4, p6, v4

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    invoke-static {v0, v1, v4}, Lkevin/fun/hook/download/DownloadManager;->ۥۨۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_42
    const v4, 0x1701a7

    :goto_1e
    const v5, 0x1701b8

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_1a

    goto :goto_1e

    :sswitch_43
    if-eqz p8, :cond_e

    const v4, 0x17048f

    goto :goto_1e

    :cond_e
    :sswitch_44
    const v4, 0x170470

    goto :goto_1e

    :sswitch_45
    const/4 v4, 0x0

    aget-boolean v5, p9, v4

    const v4, 0x1704ae

    :goto_1f
    const v6, 0x1704bf

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_1b

    goto :goto_1f

    :sswitch_46
    if-nez v5, :cond_f

    const v4, 0x17050b

    goto :goto_1f

    :cond_f
    :sswitch_47
    const v4, 0x1704ec

    goto :goto_1f

    :sswitch_48
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۦۡۦۧ()Landroid/os/Handler;

    move-result-object v10

    new-instance v4, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda12;

    move-object/from16 v5, p0

    move-object/from16 v6, p10

    move-object/from16 v8, p5

    invoke-direct/range {v4 .. v9}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda12;-><init>(Lkevin/fun/hook/download/DownloadManager;[Landroid/app/Dialog;ZLandroid/content/Context;Ljava/lang/String;)V

    invoke-static {v10, v4}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v4, 0x17052a

    :goto_20
    const v5, 0x17053b

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_1c

    goto :goto_20

    :sswitch_49
    const v4, 0x170549

    goto :goto_20

    :sswitch_4a
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v4

    invoke-static {v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۥ۟ۡ(Ljava/lang/Object;)Z

    move-result v5

    const v4, 0x170831

    :goto_21
    const v6, 0x170842

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_1d

    goto :goto_21

    :cond_10
    :sswitch_4b
    const v4, 0x17086f

    goto :goto_21

    :sswitch_4c
    if-eqz v5, :cond_10

    const v4, 0x17088e

    goto :goto_21

    :sswitch_4d
    const v4, 0x1708ad

    :goto_22
    const v5, 0x1708be

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_1e

    goto :goto_22

    :sswitch_4e
    if-nez v7, :cond_11

    const v4, 0x17090a

    goto :goto_22

    :cond_11
    :sswitch_4f
    const v4, 0x1708eb

    goto :goto_22

    :sswitch_50
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Landroidx/lifecycle/process/۠ۢۧۡ;->۠۠ۨۦ(Ljava/lang/Object;Z)V

    :sswitch_51
    const v4, 0x170929

    :goto_23
    const v5, 0x17093a

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_1f

    goto :goto_23

    :sswitch_52
    if-nez v7, :cond_12

    const v4, 0x170c11

    goto :goto_23

    :cond_12
    :sswitch_53
    const v4, 0x170bf2

    goto :goto_23

    :sswitch_54
    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p2

    invoke-static {v0, v1, v2, v4}, Lkevin/fun/hook/download/DownloadManager;->ۢۢۦ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    goto/16 :goto_2

    :catch_6
    move-exception v4

    goto/16 :goto_12

    :catch_7
    move-exception v4

    goto/16 :goto_d

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
        0xb918 -> :sswitch_16
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_e
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
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x2d -> :sswitch_1f
        0x32 -> :sswitch_18
        0x4c -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0x35 -> :sswitch_1f
        0xf3 -> :sswitch_1b
        0xfeb -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1d
        0x36 -> :sswitch_27
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        0x13 -> :sswitch_1e
        0x32 -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_20
        0x7ab -> :sswitch_21
        0x7c8 -> :sswitch_27
        0x7e9 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_23
        0x36 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_24
        0x3ef -> :sswitch_26
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_25
        0x32 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_28
        0x32 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_29
        0x6a7 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_2b
        0x32 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x11 -> :sswitch_2d
        0x3e -> :sswitch_2e
        0x5f -> :sswitch_3a
        0x7c -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_30
        0x36 -> :sswitch_31
        0x57 -> :sswitch_38
        0x74 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_33
        0x5bb -> :sswitch_34
        0x5d8 -> :sswitch_3a
        0x5f9 -> :sswitch_35
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x1f -> :sswitch_36
        0x3e -> :sswitch_37
        0x5d -> :sswitch_3a
        0x7c -> :sswitch_38
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x17 -> :sswitch_39
        0x36 -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0xe -> :sswitch_3c
        0x2d -> :sswitch_42
        0x6f -> :sswitch_3d
        0x1cc -> :sswitch_3e
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0x17 -> :sswitch_3f
        0x55 -> :sswitch_42
        0x76 -> :sswitch_40
        0xb4 -> :sswitch_41
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x1f -> :sswitch_43
        0x537 -> :sswitch_45
        0x5c8 -> :sswitch_4a
        0x5e9 -> :sswitch_44
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x11 -> :sswitch_46
        0x53 -> :sswitch_4a
        0x72 -> :sswitch_47
        0x1b4 -> :sswitch_48
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_49
        0x72 -> :sswitch_51
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x12 -> :sswitch_4b
        0x2d -> :sswitch_51
        0x73 -> :sswitch_4c
        0xcc -> :sswitch_4d
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x13 -> :sswitch_4e
        0x55 -> :sswitch_51
        0x72 -> :sswitch_4f
        0x1b4 -> :sswitch_50
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_52
        0x2c8 -> :sswitch_6
        0x2e9 -> :sswitch_53
        0x52b -> :sswitch_54
    .end sparse-switch
.end method

.method synthetic lambda$6$kevin-fun-hook-download-DownloadManager([Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    const/4 v2, 0x0

    aget-object v1, p1, v2

    const/16 v0, 0x650

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
    aget-object v0, p1, v2

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۤۥۣۡ(Ljava/lang/Object;)Z

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
    aget-object v0, p1, v2

    invoke-static {v0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    :sswitch_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0, p3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x73a

    sget v3, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v3, v3, 0x15

    const/16 v4, 0x9f3

    invoke-static {v1, v2, v3, v4}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p2, v0}, Lkevin/fun/hook/download/DownloadManager;->۟۠۟ۧۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

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
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method synthetic lambda$8$kevin-fun-hook-download-DownloadManager([Landroid/app/Dialog;ZLandroid/content/Context;Ljava/lang/String;)V
    .locals 5

    const/4 v2, 0x0

    aget-object v1, p1, v2

    const/16 v0, 0x650

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
    aget-object v0, p1, v2

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۤۥۣۡ(Ljava/lang/Object;)Z

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
    aget-object v0, p1, v2

    invoke-static {v0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    :sswitch_6
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-nez p2, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v0, 0xbe41

    goto :goto_2

    :sswitch_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v1

    const/16 v2, 0x740

    sget v3, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v3, v3, 0x1ec

    const/16 v4, 0xa29

    invoke-static {v1, v2, v3, v4}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, p4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p3, v0}, Lkevin/fun/hook/download/DownloadManager;->۟ۦۣۦ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_a
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

.method synthetic lambda$9$kevin-fun-hook-download-DownloadManager(Ljava/util/concurrent/atomic/AtomicInteger;ZZLandroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p4

    move-object v2, p5

    move-object v3, p6

    move v4, p3

    move-object v5, p7

    :try_start_0
    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/download/DownloadManager;->ۣ۟ۧۤ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۡۢۦۨ(Ljava/lang/Object;)I

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۥ۟ۡ(Ljava/lang/Object;)Z

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
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {v0, v6}, Landroidx/lifecycle/process/۠ۢۧۡ;->۠۠ۨۦ(Ljava/lang/Object;Z)V

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-nez p2, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۦۡۦۧ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0, p3, p4}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda3;-><init>(Lkevin/fun/hook/download/DownloadManager;ZLandroid/content/Context;)V

    :sswitch_8
    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    invoke-static {}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۦۣۡۡ()I

    move-result v1

    const v0, 0xc984

    :goto_4
    const v2, 0xc995

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_a
    if-ltz v1, :cond_4

    const v0, 0xc9e1

    goto :goto_4

    :sswitch_b
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_c
    const v0, 0xbefb

    :goto_5
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_d
    const v0, 0xbf1a

    goto :goto_5

    :catchall_0
    move-exception v0

    const v1, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_6

    goto :goto_6

    :sswitch_e
    const v1, 0xc221

    goto :goto_6

    :catch_0
    move-exception v0

    :try_start_1
    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->۟ۢۤۨ()[S

    move-result-object v2

    const/16 v3, 0x746

    sget v4, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v4, v4, -0xfc

    const/16 v5, 0x2ae

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/download/DownloadManager;->ۡۨ۟(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {p1}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۡۢۦۨ(Ljava/lang/Object;)I

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۥ۟ۡ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc27e

    :goto_7
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :cond_2
    :sswitch_f
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_10
    if-eqz v1, :cond_2

    const v0, 0xc2db

    goto :goto_7

    :sswitch_11
    const v0, 0xc2fa

    :goto_8
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_8

    :sswitch_12
    const v0, 0xc5a4

    goto :goto_8

    :sswitch_13
    const v0, 0xc601

    :goto_9
    const v1, 0xc612

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_9

    :sswitch_14
    if-nez p2, :cond_3

    const v0, 0xc65e

    goto :goto_9

    :cond_3
    :sswitch_15
    const v0, 0xc63f

    goto :goto_9

    :sswitch_16
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۦۡۦۧ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0, p3, p4}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda3;-><init>(Lkevin/fun/hook/download/DownloadManager;ZLandroid/content/Context;)V

    const v2, 0xc67d

    :goto_a
    const v3, 0xc68e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_a

    goto :goto_a

    :sswitch_17
    const v2, 0xc69c

    goto :goto_a

    :cond_4
    :sswitch_18
    const v0, 0xc9c2

    goto/16 :goto_4

    :sswitch_19
    const-string v0, "aSQzOzCahstl0J0Hc2ZEdt"

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۥۦ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_1a
    return-void

    :sswitch_1b
    invoke-static {p1}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۡۢۦۨ(Ljava/lang/Object;)I

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v1

    invoke-static {v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۥ۟ۡ(Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xca00

    :goto_b
    const v3, 0xca11

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_b

    goto :goto_b

    :cond_5
    :sswitch_1c
    const v1, 0xca3e

    goto :goto_b

    :sswitch_1d
    if-nez v2, :cond_5

    const v1, 0xca5d

    goto :goto_b

    :sswitch_1e
    const v1, 0xca7c

    :goto_c
    const v2, 0xca8d

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_c

    goto :goto_c

    :sswitch_1f
    if-nez p2, :cond_6

    const v1, 0xcd64

    goto :goto_c

    :cond_6
    :sswitch_20
    const v1, 0xcd45

    goto :goto_c

    :sswitch_21
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->ۦۡۦۧ()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda3;

    invoke-direct {v2, p0, p3, p4}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda3;-><init>(Lkevin/fun/hook/download/DownloadManager;ZLandroid/content/Context;)V

    invoke-static {v1, v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v1, 0xcd83

    :goto_d
    const v2, 0xcd94

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_d

    goto :goto_d

    :sswitch_22
    const v1, 0xcda2

    goto :goto_d

    :sswitch_23
    const v1, 0xcdff

    :goto_e
    const v2, 0xce10

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_e

    goto :goto_e

    :sswitch_24
    throw v0

    :sswitch_25
    const v1, 0xce1e

    goto :goto_e

    :sswitch_26
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager;->۟ۡۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v1

    invoke-static {v1, v6}, Landroidx/lifecycle/process/۠ۢۧۡ;->۠۠ۨۦ(Ljava/lang/Object;Z)V

    const v1, 0xd106

    :goto_f
    const v2, 0xd117

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_f

    goto :goto_f

    :sswitch_27
    const v1, 0xd125

    goto :goto_f

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
        0x36 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x11 -> :sswitch_a
        0x36 -> :sswitch_18
        0x57 -> :sswitch_1a
        0x74 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_9
        0x1f7 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_f
        0x33 -> :sswitch_13
        0x54 -> :sswitch_11
        0xf1 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_12
        0x6af -> :sswitch_2
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x13 -> :sswitch_14
        0x2d -> :sswitch_c
        0x32 -> :sswitch_15
        0x4c -> :sswitch_16
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x12 -> :sswitch_8
        0xf3 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_1c
        0x11 -> :sswitch_1d
        0x2f -> :sswitch_26
        0x4c -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_1f
        0x7ab -> :sswitch_20
        0x7c8 -> :sswitch_23
        0x7e9 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_22
        0x36 -> :sswitch_24
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_24
        0x3ef -> :sswitch_25
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_27
        0x32 -> :sswitch_23
    .end sparse-switch
.end method

.method public setCommentInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 4

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

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
    if-eqz p1, :cond_0

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
    move-object p1, v0

    :sswitch_5
    iput-object p1, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentAuthorName:Ljava/lang/String;

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz p2, :cond_1

    const v1, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v1, 0xbe41

    goto :goto_2

    :sswitch_8
    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    iput-object p2, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentAuthorAccount:Ljava/lang/String;

    const v1, 0xbefb

    :goto_5
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_a
    const v1, 0xbf39

    goto :goto_5

    :sswitch_b
    const v1, 0xbe9e

    goto :goto_3

    :sswitch_c
    move-object p2, v0

    goto :goto_4

    :sswitch_d
    if-eqz p3, :cond_2

    const v1, 0xc1e3

    goto :goto_5

    :sswitch_e
    const v1, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    const v1, 0xc221

    goto :goto_6

    :sswitch_10
    move-object p3, v0

    :sswitch_11
    iput-object p3, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentAuthorUid:Ljava/lang/String;

    const v1, 0xc27e

    :goto_7
    const v2, 0xc28f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :cond_3
    :sswitch_12
    const v1, 0xc2bc

    goto :goto_7

    :sswitch_13
    if-eqz p4, :cond_3

    const v1, 0xc2db

    goto :goto_7

    :sswitch_14
    const v1, 0xc2fa

    :goto_8
    const v2, 0xc30b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :sswitch_15
    const v1, 0xc5a4

    goto :goto_8

    :sswitch_16
    move-object p4, v0

    :sswitch_17
    iput-object p4, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentId:Ljava/lang/String;

    const v1, 0xc601

    :goto_9
    const v2, 0xc612

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_8

    goto :goto_9

    :sswitch_18
    if-eqz p5, :cond_4

    const v1, 0xc65e

    goto :goto_9

    :cond_4
    :sswitch_19
    const v1, 0xc63f

    goto :goto_9

    :sswitch_1a
    move-object p5, v0

    :sswitch_1b
    iput-object p5, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentText:Ljava/lang/String;

    iput-wide p6, p0, Lkevin/fun/hook/download/DownloadManager;->currentCommentCreateTime:J

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
        0x2d -> :sswitch_1a
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1b
    .end sparse-switch
.end method

.method public setWorkInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 4

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

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
    if-eqz p1, :cond_0

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
    move-object p1, v0

    :sswitch_5
    iput-object p1, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkAuthorName:Ljava/lang/String;

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz p2, :cond_1

    const v1, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v1, 0xbe41

    goto :goto_2

    :sswitch_8
    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    iput-object p2, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkAuthorAccount:Ljava/lang/String;

    const v1, 0xbefb

    :goto_5
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_a
    const v1, 0xbf39

    goto :goto_5

    :sswitch_b
    const v1, 0xbe9e

    goto :goto_3

    :sswitch_c
    move-object p2, v0

    goto :goto_4

    :sswitch_d
    if-eqz p3, :cond_2

    const v1, 0xc1e3

    goto :goto_5

    :sswitch_e
    const v1, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    const v1, 0xc221

    goto :goto_6

    :sswitch_10
    move-object p3, v0

    :sswitch_11
    iput-object p3, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkAuthorUid:Ljava/lang/String;

    const v1, 0xc27e

    :goto_7
    const v2, 0xc28f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :cond_3
    :sswitch_12
    const v1, 0xc2bc

    goto :goto_7

    :sswitch_13
    if-eqz p4, :cond_3

    const v1, 0xc2db

    goto :goto_7

    :sswitch_14
    const v1, 0xc2fa

    :goto_8
    const v2, 0xc30b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :sswitch_15
    const v1, 0xc5a4

    goto :goto_8

    :sswitch_16
    move-object p4, v0

    :sswitch_17
    iput-object p4, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkVideoId:Ljava/lang/String;

    const v1, 0xc601

    :goto_9
    const v2, 0xc612

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_8

    goto :goto_9

    :sswitch_18
    if-eqz p5, :cond_4

    const v1, 0xc65e

    goto :goto_9

    :cond_4
    :sswitch_19
    const v1, 0xc63f

    goto :goto_9

    :sswitch_1a
    move-object p5, v0

    :sswitch_1b
    iput-object p5, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkVideoDesc:Ljava/lang/String;

    iput-wide p6, p0, Lkevin/fun/hook/download/DownloadManager;->currentWorkCreateTime:J

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

    move-result v1

    const v0, 0xc67d

    :goto_a
    const v2, 0xc68e

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_9

    goto :goto_a

    :cond_5
    :sswitch_1c
    const v0, 0xc6bb

    goto :goto_a

    :sswitch_1d
    if-gtz v1, :cond_5

    const v0, 0xc965

    goto :goto_a

    :sswitch_1e
    const-string v0, "iQpZhI2"

    invoke-static {v0}, Landroidx/loader/۟۠ۢۧۡ;->ۨۧۦۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_1f
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
        0x2d -> :sswitch_1a
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1c
        0x35 -> :sswitch_1f
        0xf3 -> :sswitch_1d
        0xfeb -> :sswitch_1e
    .end sparse-switch
.end method
