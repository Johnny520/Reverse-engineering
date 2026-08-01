.class public final synthetic Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/download/DownloadManager;

.field public final f$1:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final f$2:Z

.field public final f$3:Z

.field public final f$4:Landroid/content/Context;

.field public final f$5:Ljava/lang/String;

.field public final f$6:Ljava/lang/String;

.field public final f$7:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/download/DownloadManager;Ljava/util/concurrent/atomic/AtomicInteger;ZZLandroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda0;->f$0:Lkevin/fun/hook/download/DownloadManager;

    iput-object p2, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda0;->f$1:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-boolean p3, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda0;->f$2:Z

    iput-boolean p4, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda0;->f$3:Z

    iput-object p5, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda0;->f$4:Landroid/content/Context;

    iput-object p6, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda0;->f$5:Ljava/lang/String;

    iput-object p7, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda0;->f$6:Ljava/lang/String;

    iput-object p8, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda0;->f$7:Ljava/lang/String;

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
    const-string v0, "ClmAKOIp9LKXy9CWLgxPyYKva3z"

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۤۦۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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

.method public static ۣۣ۟ۨۨ(Ljava/lang/Object;Ljava/lang/Object;ZZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

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
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/download/DownloadManager;

    move-object v1, p1

    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    move-object v4, p4

    check-cast v4, Landroid/content/Context;

    move-object v5, p5

    check-cast v5, Ljava/lang/String;

    move-object v6, p6

    check-cast v6, Ljava/lang/String;

    move-object v7, p7

    check-cast v7, Ljava/lang/String;

    move v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager;->lambda$9$kevin-fun-hook-download-DownloadManager(Ljava/util/concurrent/atomic/AtomicInteger;ZZLandroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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


# virtual methods
.method public final run()V
    .locals 11

    const/4 v10, 0x0

    const/4 v8, 0x0

    const-string v9, "\u06e8\u06e0\u06e7"

    move-object v4, v8

    move-object v1, v8

    move-object v0, v8

    move-object v7, v8

    move-object v6, v8

    move-object v5, v8

    move v2, v10

    move v3, v10

    :goto_0
    invoke-static {v9}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v8

    sparse-switch v8, :sswitch_data_0

    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->ۢۦ۠ۡ(Ljava/lang/Object;)Z

    move-result v3

    const-string v8, "\u06e7\u06e8\u06e2"

    move-object v9, v8

    goto :goto_0

    :sswitch_0
    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda0;->ۣۣ۟ۨۨ(Ljava/lang/Object;Ljava/lang/Object;ZZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v8, "\u06e7\u06df\u06e1"

    move-object v9, v8

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/core/ۤۦ۟ۢ;->۟ۥۢ۟ۨ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v0

    const-string v8, "\u06e6\u06df\u06e5"

    move-object v9, v8

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۡۡۢ۟(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    const-string v8, "\u06e6\u06e0"

    move-object v9, v8

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->۟ۧۡۥۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "\u06e1\u06e6\u06e3"

    move-object v9, v8

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/loader/ۢۥ۟;->۟ۧۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "\u06e1\u06e4\u06e0"

    move-object v9, v8

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Landroidx/loader/ۣ۟۟ۧ۠;->ۨۢۦۧ(Ljava/lang/Object;)Z

    move-result v2

    const-string v8, "\u06e4\u06e2\u06e7"

    move-object v9, v8

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۢ۟ۧۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v4

    const-string v8, "\u06e4\u06e4\u06e4"

    move-object v9, v8

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۤۨۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v8, "\u06df\u06e7"

    move-object v9, v8

    goto :goto_0

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe8 -> :sswitch_4
        0xdcba -> :sswitch_5
        0x1aaf1d -> :sswitch_3
        0x1aaf5e -> :sswitch_0
        0x1aba64 -> :sswitch_7
        0x1ac14c -> :sswitch_2
        0x1ac509 -> :sswitch_8
        0x1ac621 -> :sswitch_6
        0x1ac8ef -> :sswitch_1
    .end sparse-switch
.end method
