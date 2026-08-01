.class Lkevin/fun/hook/DYHook$BatchDownloadManager;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/hook/DYHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "BatchDownloadManager"
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final failedCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field final finishedCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field isRunning:Z

.field final lock:Ljava/lang/Object;

.field progressDialog:Landroid/app/Dialog;

.field progressHolder:Lkevin/fun/hook/DYHook$ProgressViewHolder;

.field final successCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field final this$0:Lkevin/fun/hook/DYHook;

.field totalCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x38

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->short:[S

    return-void

    :array_0
    .array-data 2
        0x6d5s
        0x694s
        0x6d0s
        0x6dfs
        0x6d0s
        0x6d5s
        0x694s
        0x6d0s
        0x6d8s
        0x64e0s
        0x546fs
        0x6cas
        0x6d5s
        0x694s
        0x6d0s
        0x5fc1s
        -0x742bs
        0x6cas
        0x6d5s
        0x694s
        0x6d9s
        0x63ebs
        0x5fa0s
        0x4683s
        -0x780bs
        0x8a8s
        0x8ads
        0x8ecs
        0x8a7s
        0x8ads
        0x8ecs
        0x5a30s
        0x7732s
        0x58b8s
        0x6124s
        0x48f4s
        -0x767es
        0x5d73s
        0x64efs
        0x6dfs
        0x21ecs
        0x6f5s
        0x64efs
        0x5460s
        0x6c5s
        0x6dfs
        0x6das
        0x69bs
        0x6dfs
        0x6dfs
        0x5fces
        -0x7426s
        0x6c5s
        0x6dfs
        0x6das
        0x69bs
    .end array-data
.end method

.method private constructor <init>(Lkevin/fun/hook/DYHook;)V
    .locals 2

    const/4 v1, 0x0

    iput-object p1, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->this$0:Lkevin/fun/hook/DYHook;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->finishedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->successCount:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->failedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    iput v1, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->totalCount:I

    iput-boolean v1, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->isRunning:Z

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->lock:Ljava/lang/Object;

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
    const-string v0, "4346U5q"

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۧۦۦۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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

.method synthetic constructor <init>(Lkevin/fun/hook/DYHook;Lkevin/fun/hook/DYHook-IA;)V
    .locals 2

    invoke-direct {p0, p1}, Lkevin/fun/hook/DYHook$BatchDownloadManager;-><init>(Lkevin/fun/hook/DYHook;)V

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "ZZHMmBDs2"

    invoke-static {v0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۟ۥۣۧۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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

.method private updateProgress()V
    .locals 9

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۥۨۢۨ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

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
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۧ۟ۢۨ(Ljava/lang/Object;)Landroid/app/Dialog;

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
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۧ۟ۢۨ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v0

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
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣۧۦۨ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$ProgressViewHolder;

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
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->۟۠ۨۤۤ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣ۟ۢۦۧ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣ۟ۧۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۡۧۡۨ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v4

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣۧۦۨ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$ProgressViewHolder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣ۟ۡۡۥ(Ljava/lang/Object;)Landroid/widget/ProgressBar;

    move-result-object v5

    const v0, 0xbefb

    :goto_4
    const v6, 0xbf0c

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_c
    const v0, 0xbf39

    goto :goto_4

    :sswitch_d
    if-eqz v5, :cond_4

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_e
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣۧۦۨ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$ProgressViewHolder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣ۟ۡۡۥ(Ljava/lang/Object;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/loader/ۣ۟۟ۧ۠;->ۤۥۨۨ(Ljava/lang/Object;I)V

    :sswitch_f
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣۧۦۨ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$ProgressViewHolder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->۟ۡ۟ۨۨ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v5

    const v0, 0xc202

    :goto_5
    const v6, 0xc213

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_10
    if-eqz v5, :cond_5

    const v0, 0xc25f

    goto :goto_5

    :cond_5
    :sswitch_11
    const v0, 0xc240

    goto :goto_5

    :sswitch_12
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣۧۦۨ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$ProgressViewHolder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->۟ۡ۟ۨۨ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v1}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v4}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v7, 0x4

    new-array v7, v7, [Ljava/lang/Object;

    sget v8, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v8, v8, 0x2

    aput-object v5, v7, v8

    sget v5, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v5, v5, 0x252

    aput-object v6, v7, v5

    sget v5, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v5, v5, 0x0

    aput-object v3, v7, v5

    sget v3, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v3, v3, -0x21d

    aput-object v4, v7, v3

    invoke-static {}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣ۟۠ۢ۟()[S

    move-result-object v3

    const/4 v4, 0x0

    sget v5, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v5, v5, 0x67

    const/16 v6, 0x6f0

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v7}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_13
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣۧۦۨ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$ProgressViewHolder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۦۧ۠(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v3

    const v0, 0xc27e

    :goto_6
    const v4, 0xc28f

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :cond_6
    :sswitch_14
    const v0, 0xc2bc

    goto :goto_6

    :sswitch_15
    if-eqz v3, :cond_6

    const v0, 0xc2db

    goto :goto_6

    :sswitch_16
    const v0, 0xc2fa

    :goto_7
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_17
    if-ge v1, v2, :cond_7

    const v0, 0xc5e2

    goto :goto_7

    :cond_7
    :sswitch_18
    const v0, 0xc5c3

    goto :goto_7

    :sswitch_19
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣۧۦۨ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$ProgressViewHolder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۦۧ۠(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v1}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v4, v4, 0x72

    aput-object v1, v3, v4

    sget v1, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v1, v1, 0x8d

    aput-object v2, v3, v1

    invoke-static {}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣ۟۠ۢ۟()[S

    move-result-object v1

    const/16 v2, 0x15

    sget v4, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v4, v4, 0x33f

    const/16 v5, 0x888

    invoke-static {v1, v2, v4, v5}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc601

    :goto_8
    const v1, 0xc612

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_8

    :sswitch_1a
    const v0, 0xc620

    goto :goto_8

    :sswitch_1b
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣۧۦۨ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$ProgressViewHolder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۦۧ۠(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣ۟۠ۢ۟()[S

    move-result-object v1

    const/16 v2, 0x1f

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v3, v3, -0x7f

    const/16 v4, 0x334

    invoke-static {v1, v2, v3, v4}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_1c
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_1c
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_1c
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_1c
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_1c
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
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
        0x53 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_1c
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_18
        0x6c8 -> :sswitch_1b
        0x6e9 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1a
        0x32 -> :sswitch_1c
    .end sparse-switch
.end method

.method public static ۣ۟۠ۢ۟()[S
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
    sget-object v0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->short:[S

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

.method public static ۟۠ۨۤۤ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;
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
    check-cast p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->finishedCount:Ljava/util/concurrent/atomic/AtomicInteger;

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

.method public static ۟ۡ۟ۨۨ(Ljava/lang/Object;)Landroid/widget/TextView;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$ProgressViewHolder;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$ProgressViewHolder;->progressInfo:Landroid/widget/TextView;

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

.method public static ۣ۟ۢۦۧ(Ljava/lang/Object;)I
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
    check-cast p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;

    iget v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->totalCount:I

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

.method public static ۟ۢۧۡۤ()Landroid/app/Application;
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
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

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

.method public static ۣ۟ۡۡۥ(Ljava/lang/Object;)Landroid/widget/ProgressBar;
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
    check-cast p0, Lkevin/fun/hook/DYHook$ProgressViewHolder;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$ProgressViewHolder;->progressBar:Landroid/widget/ProgressBar;

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

.method public static ۣ۟ۧۦۤ(Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;

    invoke-direct {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->updateProgress()V

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

.method public static ۟ۦۣۡۧ(Ljava/lang/Object;)Ljava/lang/Object;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->lock:Ljava/lang/Object;

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

.method public static ۣ۟ۧۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->successCount:Ljava/util/concurrent/atomic/AtomicInteger;

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

.method public static ۠ۦۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Landroid/app/Dialog;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$msafelyDismissDialog(Lkevin/fun/hook/DYHook;Landroid/app/Dialog;)V

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
    const-string v0, "NHDDaCcRy"

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۢۢۡۤ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۡۢۤۢ()Landroid/os/Handler;
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
    invoke-static {}, Lkevin/fun/hook/DYHook;->_$$Nest$sfgetMAIN_HANDLER()Landroid/os/Handler;

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

.method public static ۡۧۡۨ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;
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
    check-cast p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->failedCount:Ljava/util/concurrent/atomic/AtomicInteger;

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

.method public static ۤۤۧ(Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;

    invoke-virtual {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->reset()V

    :sswitch_3
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

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
    const-string v0, "oTGGb7cYH2zCboxhNNkONHRSmpgH"

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

.method public static ۥۨۢۨ(Ljava/lang/Object;)Z
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
    check-cast p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;

    iget-boolean v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->isRunning:Z

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

.method public static ۦۧ۠(Ljava/lang/Object;)Landroid/widget/TextView;
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
    check-cast p0, Lkevin/fun/hook/DYHook$ProgressViewHolder;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$ProgressViewHolder;->hintText:Landroid/widget/TextView;

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

.method public static ۧ۟ۢۨ(Ljava/lang/Object;)Landroid/app/Dialog;
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
    check-cast p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->progressDialog:Landroid/app/Dialog;

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

.method public static ۣۧۦۨ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$ProgressViewHolder;
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
    check-cast p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->progressHolder:Lkevin/fun/hook/DYHook$ProgressViewHolder;

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

.method public static ۧۧۥۤ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
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
    check-cast p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->this$0:Lkevin/fun/hook/DYHook;

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
.method synthetic lambda$0$kevin-fun-hook-DYHook$BatchDownloadManager()V
    .locals 0

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣ۟ۧۦۤ(Ljava/lang/Object;)V

    return-void
.end method

.method synthetic lambda$1$kevin-fun-hook-DYHook$BatchDownloadManager()V
    .locals 7

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->۟ۦۣۡۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۧ۟ۢۨ(Ljava/lang/Object;)Landroid/app/Dialog;

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
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۧ۟ۢۨ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۤۥۣۡ(Ljava/lang/Object;)Z

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
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۧ۟ۢۨ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v0

    invoke-static {v0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->۟ۢۧۡۤ()Landroid/app/Application;

    move-result-object v2

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-eqz v2, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v0, 0xbe41

    goto :goto_2

    :sswitch_9
    invoke-static {}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣ۟۠ۢ۟()[S

    move-result-object v0

    const/16 v3, 0x23

    sget v4, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v4, v4, 0x1ff

    const/16 v5, 0x6ff

    invoke-static {v0, v3, v4, v5}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣ۟ۧۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v3

    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۡۧۡۨ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v4

    invoke-static {v4}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v4

    invoke-static {v4}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    sget v6, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v6, v6, -0x3c7

    aput-object v3, v5, v6

    sget v3, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v3, v3, 0x334

    aput-object v4, v5, v3

    invoke-static {v0, v5}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/activity/ۣۦۡۥ;->۟ۥۨۧۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_a
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۤۤۧ(Ljava/lang/Object;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

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

.method onTaskComplete(Z)V
    .locals 8

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->۟ۦۣۡۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->۟۠ۨۤۤ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-static {v0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۡۢۦۨ(Ljava/lang/Object;)I

    const/16 v0, 0x650

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
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣ۟ۧۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-static {v0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۡۢۦۨ(Ljava/lang/Object;)I

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۡۧۡۨ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-static {v0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۡۢۦۨ(Ljava/lang/Object;)I

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->۟۠ۨۤۤ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣ۟ۢۦۧ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۡۢۤۢ()Landroid/os/Handler;

    move-result-object v0

    new-instance v4, Lkevin/fun/hook/DYHook$BatchDownloadManager$$ExternalSyntheticLambda0;

    invoke-direct {v4, p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager$$ExternalSyntheticLambda0;-><init>(Lkevin/fun/hook/DYHook$BatchDownloadManager;)V

    invoke-static {v0, v4}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-lt v2, v3, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
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
    if-lez v3, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۡۢۤۢ()Landroid/os/Handler;

    move-result-object v0

    new-instance v2, Lkevin/fun/hook/DYHook$BatchDownloadManager$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager$$ExternalSyntheticLambda1;-><init>(Lkevin/fun/hook/DYHook$BatchDownloadManager;)V

    const-wide/16 v4, 0x7b

    sget v3, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    int-to-long v6, v3

    xor-long/2addr v4, v6

    invoke-static {v0, v2, v4, v5}, Landroidx/loader/۟۠ۢۧۡ;->ۣۤۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z

    :sswitch_c
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
.end method

.method reset()V
    .locals 3

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->۟ۦۣۡۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->۟۠ۨۤۤ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣ۟ۧۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۡۧۡۨ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    iput v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->totalCount:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->isRunning:Z

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۧۧۥۤ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۧ۟ۢۨ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->۠ۦۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->progressDialog:Landroid/app/Dialog;

    const/4 v0, 0x0

    iput-object v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->progressHolder:Lkevin/fun/hook/DYHook$ProgressViewHolder;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method startBatch(I)V
    .locals 3

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->۟ۦۣۡۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iput p1, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->totalCount:I

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->۟۠ۨۤۤ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۣ۟ۧۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$BatchDownloadManager;->ۡۧۡۨ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lkevin/fun/hook/DYHook$BatchDownloadManager;->isRunning:Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
