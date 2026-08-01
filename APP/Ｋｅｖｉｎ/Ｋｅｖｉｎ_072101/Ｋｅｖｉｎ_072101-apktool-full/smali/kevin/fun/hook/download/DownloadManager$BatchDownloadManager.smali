.class public Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/hook/download/DownloadManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BatchDownloadManager"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;
    }
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field private failedCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private finishedCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private isCompleted:Z

.field private isRunning:Z

.field private progressDialog:Landroid/app/Dialog;

.field private progressHolder:Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;

.field private successCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field final this$0:Lkevin/fun/hook/download/DownloadManager;

.field private totalCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->short:[S

    return-void

    :array_0
    .array-data 2
        0x3898s
        0x8c3s
        0x8eds
        0x8fes
        0x8e1s
        0x8e6s
        0x8a5s
        0x8ccs
        0x8e7s
        0x8ffs
        0x8e6s
        0x8e4s
        0x8e7s
        0x8e9s
        0x8ecs
        0x3899s
        0x8a8s
        0x59fbs
        -0x629bs
        -0x78ads
        0x562es
        0x5371s
        -0x7cabs
        0x60ces
        0x51b9s
        -0x7a53s
        0x8b2s
        0x8a8s
        0x44eas
        -0x7a64s
        0x516ds
        0x68f1s
        0xac1s
        0x2df2s
        0xaebs
        0x68f1s
        0x587es
        0xadbs
        0xac1s
        0xac4s
        0xa85s
        0xac1s
        0xac1s
        0x53d0s
        -0x783cs
        0xadbs
        0xac1s
        0xac4s
        0xa85s
        0x80es
        0x81es
        0x811s
        0x81es
        0x6fefs
        0x53a4s
        0x5d88s
        0x708as
        0x4a2s
        0x4a2s
        0x4a2s
    .end array-data
.end method

.method public constructor <init>(Lkevin/fun/hook/download/DownloadManager;)V
    .locals 2

    const/4 v1, 0x0

    iput-object p1, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->this$0:Lkevin/fun/hook/download/DownloadManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->finishedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->successCount:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->failedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    iput v1, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->totalCount:I

    iput-boolean v1, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->isRunning:Z

    iput-boolean v1, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->isCompleted:Z

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "WOajshmhSyL"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۢۥۥ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method private dismissProgressDialog()V
    .locals 7

    const/4 v6, 0x0

    :try_start_0
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۢۥ۠ۦ(Ljava/lang/Object;)Landroid/app/Dialog;

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
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۢۥ۠ۦ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v0

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
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۢۥ۠ۦ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v0

    invoke-static {v0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :sswitch_6
    iput-object v6, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->progressDialog:Landroid/app/Dialog;

    iput-object v6, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->progressHolder:Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    const v0, 0xbe22

    goto :goto_2

    :catchall_0
    move-exception v0

    :try_start_1
    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟ۢۡۤ۟()[S

    move-result-object v2

    const/4 v3, 0x0

    sget v4, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v4, v4, 0x303

    const/16 v5, 0x888

    invoke-static {v2, v3, v4, v5}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟۟ۢۧۧ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_8
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_9
    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

    move-result v1

    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_2
    :sswitch_a
    const v0, 0xbf39

    goto :goto_4

    :sswitch_b
    if-ltz v1, :cond_2

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_c
    const-string v0, "kwdjs2Z8KMTtAzFwdyMI"

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۢۢۡۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :sswitch_d
    return-void

    :catchall_1
    move-exception v0

    iput-object v6, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->progressDialog:Landroid/app/Dialog;

    iput-object v6, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->progressHolder:Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;

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
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_6
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x35 -> :sswitch_d
        0x1f7 -> :sswitch_b
        0x7eef -> :sswitch_c
    .end sparse-switch
.end method

.method private updateProgress()V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟ۦ۟۠ۤ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda0;-><init>(Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public static ۟۟ۡۡ۟(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->this$0:Lkevin/fun/hook/download/DownloadManager;

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

.method public static ۟۟ۢۧۧ(Ljava/lang/Object;)V
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

.method public static ۟۟ۨ۠ۨ(Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    invoke-direct {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->dismissProgressDialog()V

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

.method public static ۣ۟۠۟ۤ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->failedCount:Ljava/util/concurrent/atomic/AtomicInteger;

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

.method public static ۟۠ۨۥۡ(Ljava/lang/Object;IIII)V
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;->update(IIII)V

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

.method public static ۟ۢۡۤ۟()[S
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
    sget-object v0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->short:[S

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

.method public static ۣ۟ۢۢ(Ljava/lang/Object;)I
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    iget v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->totalCount:I

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

.method public static ۟ۦ۟۠ۤ()Landroid/os/Handler;
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
    invoke-static {}, Lkevin/fun/hook/download/DownloadManager;->_$$Nest$sfgetMAIN_HANDLER()Landroid/os/Handler;

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

.method public static ۣ۟ۧ۟۟(Ljava/lang/Object;)Z
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    iget-boolean v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->isRunning:Z

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

.method public static ۡۥ۠ۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->successCount:Ljava/util/concurrent/atomic/AtomicInteger;

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

.method public static ۡۨۦۡ(Ljava/lang/Object;Ljava/lang/Object;F)I
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

    check-cast p1, Landroid/content/Context;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/download/DownloadManager;->_$$Nest$mdp(Lkevin/fun/hook/download/DownloadManager;Landroid/content/Context;F)I

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

.method public static ۢۥ۠ۦ(Ljava/lang/Object;)Landroid/app/Dialog;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->progressDialog:Landroid/app/Dialog;

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

.method public static ۣۧ۠(Ljava/lang/Object;)Z
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    iget-boolean v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->isCompleted:Z

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

.method public static ۦ۠ۧۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->finishedCount:Ljava/util/concurrent/atomic/AtomicInteger;

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

.method public static ۦۤ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
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

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/download/DownloadManager;->_$$Nest$mshowSuccessToast(Lkevin/fun/hook/download/DownloadManager;Landroid/content/Context;Ljava/lang/String;)V

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

.method public static ۧۧۢۧ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    iget-object v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->progressHolder:Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;

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
.method public isRunning()Z
    .locals 1

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۣ۟ۧ۟۟(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method synthetic lambda$0$kevin-fun-hook-download-DownloadManager$BatchDownloadManager(I)V
    .locals 4

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۧۧۢۧ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;

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
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۧۧۢۧ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۣ۟ۢۢ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۡۥ۠ۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-static {v2}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۣ۟۠۟ۤ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v3

    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v0, p1, v1, v2, v3}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟۠ۨۥۡ(Ljava/lang/Object;IIII)V

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۡۨۡ()I

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
    const-string v0, "bEzfwrnJ307IFsQOqqkhUAwFnk"

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟۟ۥۧۥ(Ljava/lang/String;)Ljava/lang/String;

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

.method synthetic lambda$1$kevin-fun-hook-download-DownloadManager$BatchDownloadManager(Landroid/content/Context;II)V
    .locals 5

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟۟ۨ۠ۨ(Ljava/lang/Object;)V

    const/16 v0, 0x650

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
    instance-of v1, p1, Landroid/app/Activity;

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
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Landroidx/loader/ۣۦ۟ۡ;->ۥۣ۠ۨ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {p2}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p3}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v3, v3, 0x166

    aput-object v0, v2, v3

    sget v0, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v0, v0, 0x3a1

    aput-object v1, v2, v0

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟ۢۡۤ۟()[S

    move-result-object v0

    const/16 v1, 0x1c

    sget v3, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v3, v3, -0x60

    const/16 v4, 0xae1

    invoke-static {v0, v1, v3, v4}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟۟ۡۡ۟(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۦۤ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_9
    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۤۡۢ(Ljava/lang/Object;)V

    return-void

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
        0x1d7 -> :sswitch_8
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

.method synthetic lambda$2$kevin-fun-hook-download-DownloadManager$BatchDownloadManager()V
    .locals 5

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۣ۟ۧ۟۟(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

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
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۢۥ۠ۦ(Ljava/lang/Object;)Landroid/app/Dialog;

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
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۢۥ۠ۦ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۤۥۣۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez v1, :cond_2

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
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۧۧۢۧ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;

    move-result-object v1

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
    if-eqz v1, :cond_3

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_e
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۧۧۢۧ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۦ۠ۧۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۣ۟ۢۢ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۡۥ۠ۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v3

    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۣ۟۠۟ۤ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v4

    invoke-static {v4}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟۠ۨۥۡ(Ljava/lang/Object;IIII)V

    goto :goto_4

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

.method synthetic lambda$3$kevin-fun-hook-download-DownloadManager$BatchDownloadManager(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 10

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۢۥ۠ۦ(Ljava/lang/Object;)Landroid/app/Dialog;

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
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۢۥ۠ۦ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v0

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
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۢۥ۠ۦ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v0

    invoke-static {v0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    :sswitch_6
    new-instance v0, Landroid/app/Dialog;

    const v1, 0x1030062

    sget v2, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/2addr v1, v2

    invoke-direct {v0, p1, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->progressDialog:Landroid/app/Dialog;

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۢۥ۠ۦ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۡۡ۠(Ljava/lang/Object;Z)V

    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sget v1, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v1, v1, -0x383

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, -0x660003a6

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/2addr v2, v3

    invoke-static {v0, v2}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۣۢۧ(Ljava/lang/Object;I)V

    new-instance v6, Landroid/widget/LinearLayout;

    invoke-direct {v6, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    invoke-static {v6, v2}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v2, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v5, v2, -0x75

    invoke-static {v6, v5}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟۟ۡۡ۟(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v2

    const/high16 v3, 0x41c00000    # 24.0f

    invoke-static {v2, p1, v3}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۡۨۦۡ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v2

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟۟ۡۡ۟(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v3

    const/high16 v4, 0x41c00000    # 24.0f

    invoke-static {v3, p1, v4}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۡۨۦۡ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v3

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟۟ۡۡ۟(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v4

    const/high16 v7, 0x41c00000    # 24.0f

    invoke-static {v4, p1, v7}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۡۨۦۡ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v4

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟۟ۡۡ۟(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v7

    const/high16 v8, 0x41c00000    # 24.0f

    invoke-static {v7, p1, v8}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۡۨۦۡ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v7

    invoke-static {v6, v2, v3, v4, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟۟ۡۡ۟(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v3

    const/high16 v4, 0x43960000    # 300.0f

    invoke-static {v3, p1, v4}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۡۨۦۡ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v3

    sget v4, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v4, v4, -0x74

    invoke-direct {v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    iput v5, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {v6, v2}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟۟ۡۡ۟(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v3

    const/high16 v4, 0x41a00000    # 20.0f

    invoke-static {v3, p1, v4}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۡۨۦۡ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v3

    int-to-float v3, v3

    invoke-static {v2, v3}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v6, v2}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v2, p2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v3, 0x41800000    # 16.0f

    invoke-static {v2, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    const v3, -0xcccf6d

    sget v4, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/2addr v3, v4

    invoke-static {v2, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v2, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟۟ۡۡ۟(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v8

    const/high16 v9, 0x41800000    # 16.0f

    invoke-static {v8, p1, v9}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۡۨۦۡ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v8

    invoke-static {v2, v3, v4, v7, v8}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v6, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/widget/ProgressBar;

    const/4 v3, 0x0

    const v4, -0x101006c

    sget v7, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/2addr v4, v7

    invoke-direct {v2, p1, v3, v4}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟۟ۡۡ۟(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v4

    const/high16 v7, 0x40800000    # 4.0f

    invoke-static {v4, p1, v7}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۡۨۦۡ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v4

    invoke-direct {v3, v1, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۦۤ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, p3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۥۨ۟(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    invoke-static {v2, v1}, Landroidx/loader/ۣ۟۟ۧ۠;->ۤۥۨۨ(Ljava/lang/Object;I)V

    invoke-static {v6, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟ۢۡۤ۟()[S

    move-result-object v4

    const/16 v7, 0x31

    sget v8, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v8, v8, -0x3c3

    const/16 v9, 0x83e

    invoke-static {v4, v7, v8, v9}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, p3}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v3, v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v1, 0xa8d2

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/2addr v1, v4

    invoke-static {v3, v1}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-static {v3, v1}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟۟ۡۡ۟(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v4

    const/high16 v7, 0x41400000    # 12.0f

    invoke-static {v4, p1, v7}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۡۨۦۡ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v4

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static {v3, v1, v4, v7, v8}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v6, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟ۢۡۤ۟()[S

    move-result-object v1

    const/16 v7, 0x35

    sget v8, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v8, v8, -0x3a3

    const/16 v9, 0x48c

    invoke-static {v1, v7, v8, v9}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v4, v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v1, -0x666630

    sget v7, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/2addr v1, v7

    invoke-static {v4, v1}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v4, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟۟ۡۡ۟(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v5

    const/high16 v7, 0x41000000    # 8.0f

    invoke-static {v5, p1, v7}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۡۨۦۡ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static {v4, v1, v5, v7, v8}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v6, v4}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v6}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۢۥ۠ۦ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۢۥ۠ۦ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v5

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;-><init>(Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;Landroid/widget/ProgressBar;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/app/Dialog;)V

    iput-object v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->progressHolder:Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$ProgressViewHolder;

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۢۥ۠ۦ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۦۧۤۡ(Ljava/lang/Object;)V

    const v0, 0x3f666666    # 0.9f

    invoke-static {v6, v0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۡۦ۟ۦ(Ljava/lang/Object;F)V

    const v0, 0x3f666666    # 0.9f

    invoke-static {v6, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣ۟ۡۢ(Ljava/lang/Object;F)V

    const/4 v0, 0x0

    invoke-static {v6, v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۡۦۦۧ(Ljava/lang/Object;F)V

    invoke-static {v6}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۣۤۤ(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

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

    const-wide/16 v2, -0x36e

    sget v1, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    int-to-long v4, v1

    xor-long/2addr v2, v4

    invoke-static {v0, v2, v3}, Landroidx/loader/ۥۧۨۤ;->ۣۣۧ۠(Ljava/lang/Object;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v1}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۦ۟ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤ۟ۥ(Ljava/lang/Object;)V

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

.method public onTaskComplete(Z)V
    .locals 8

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۣ۟ۧ۟۟(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

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
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۦ۠ۧۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-static {v0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۡۢۦۨ(Ljava/lang/Object;)I

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz p1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۡۥ۠ۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-static {v0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۡۢۦۨ(Ljava/lang/Object;)I

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۣ۟۠۟ۤ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-static {v0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۡۢۦۨ(Ljava/lang/Object;)I

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۦ۠ۧۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟ۦ۟۠ۤ()Landroid/os/Handler;

    move-result-object v0

    new-instance v2, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0, v1}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda1;-><init>(Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;I)V

    invoke-static {v0, v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۣ۟ۢۢ(Ljava/lang/Object;)I

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
    if-lt v1, v2, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۣ۟ۢۢ(Ljava/lang/Object;)I

    move-result v1

    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_c
    const v0, 0xbf39

    goto :goto_4

    :sswitch_d
    if-lez v1, :cond_3

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_e
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۣۧ۠(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc202

    :goto_5
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    if-nez v1, :cond_4

    const v0, 0xc25f

    goto :goto_5

    :cond_4
    :sswitch_10
    const v0, 0xc240

    goto :goto_5

    :sswitch_11
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->isCompleted:Z

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۢۥ۠ۦ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v1

    const v0, 0xc27e

    :goto_6
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :cond_5
    :sswitch_12
    const v0, 0xc2bc

    goto :goto_6

    :sswitch_13
    if-eqz v1, :cond_5

    const v0, 0xc2db

    goto :goto_6

    :sswitch_14
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۢۥ۠ۦ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->۟ۥۧ۠۟(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const v1, 0xc2fa

    :goto_7
    const v2, 0xc30b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_7

    :sswitch_15
    const v1, 0xc5a4

    goto :goto_7

    :sswitch_16
    const/4 v0, 0x0

    :sswitch_17
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۡۥ۠ۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۣ۟۠۟ۤ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-static {v2}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۢ۠ۦ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟ۦ۟۠ۤ()Landroid/os/Handler;

    move-result-object v3

    new-instance v4, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda2;

    invoke-direct {v4, p0, v0, v1, v2}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda2;-><init>(Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;Landroid/content/Context;II)V

    const-wide/16 v0, 0x1f6

    sget v2, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    int-to-long v6, v2

    xor-long/2addr v0, v6

    invoke-static {v3, v4, v0, v1}, Landroidx/loader/۟۠ۢۧۡ;->ۣۤۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z

    :sswitch_18
    invoke-static {}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۢۥ۠()I

    move-result v1

    const v0, 0xc601

    :goto_8
    const v2, 0xc612

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_8

    goto :goto_8

    :sswitch_19
    if-ltz v1, :cond_6

    const v0, 0xc65e

    goto :goto_8

    :cond_6
    :sswitch_1a
    const v0, 0xc63f

    goto :goto_8

    :sswitch_1b
    const-string v0, "99JsA1EJCAtaZK"

    invoke-static {v0}, Landroidx/interpolator/ۦۨۢۦ;->ۣۢۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :sswitch_1c
    return-void

    nop

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
        0x2d -> :sswitch_18
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_18
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_18
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
        0x13 -> :sswitch_19
        0x2d -> :sswitch_1c
        0x32 -> :sswitch_1a
        0x4c -> :sswitch_1b
    .end sparse-switch
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->isRunning:Z

    iput-boolean v0, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->isCompleted:Z

    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟۟ۨ۠ۨ(Ljava/lang/Object;)V

    return-void
.end method

.method public showProgressDialog(Landroid/content/Context;ILjava/lang/String;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->۟ۦ۟۠ۤ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0, p1, p3, p2}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda3;-><init>(Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;Landroid/content/Context;Ljava/lang/String;I)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "oeSw5t3Z8DnC1QLTKpsfoQ"

    invoke-static {v0}, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۨۡ(Ljava/lang/String;)Ljava/lang/String;

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

.method public startBatch(I)V
    .locals 3

    const/4 v2, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e8\u06e8"

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-void

    :sswitch_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->isRunning:Z

    const-string v1, "\u06e1\u06e4\u06e8"

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۡۥ۠ۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const-string v1, "\u06e3\u06e5\u06e6"

    goto :goto_0

    :sswitch_2
    invoke-static {v0, v2}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    const-string v1, "\u06e3\u06e5\u06e1"

    goto :goto_0

    :sswitch_3
    iput p1, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->totalCount:I

    const-string v1, "\u06df\u06e6\u06e7"

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۦ۠ۧۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const-string v1, "\u06e6\u06e8\u06df"

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->ۣ۟۠۟ۤ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const-string v1, "\u06e0\u06e0\u06e5"

    goto :goto_0

    :sswitch_6
    invoke-static {v0, v2}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    const-string v1, "\u06e6\u06df\u06df"

    goto :goto_0

    :sswitch_7
    invoke-static {v0, v2}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    const-string v1, "\u06e0\u06e8\u06e1"

    goto :goto_0

    :sswitch_8
    iput-boolean v2, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->isCompleted:Z

    const-string v1, "\u06df\u06df\u06e8"

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7e0 -> :sswitch_4
        0x1aaae5 -> :sswitch_7
        0x1aabd9 -> :sswitch_0
        0x1aaf25 -> :sswitch_8
        0x1ab362 -> :sswitch_3
        0x1ab6bf -> :sswitch_1
        0x1ab6c4 -> :sswitch_6
        0x1ac146 -> :sswitch_5
        0x1ac25d -> :sswitch_2
    .end sparse-switch
.end method
