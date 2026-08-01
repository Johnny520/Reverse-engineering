.class public final synthetic Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda8;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/download/DownloadManager;

.field public final f$1:Z

.field public final f$2:Landroid/content/Context;

.field public final f$3:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/download/DownloadManager;ZLandroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda8;->f$0:Lkevin/fun/hook/download/DownloadManager;

    iput-boolean p2, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda8;->f$1:Z

    iput-object p3, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda8;->f$2:Landroid/content/Context;

    iput-object p4, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda8;->f$3:Ljava/lang/String;

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
    const-string v0, "RwY66t2wGJjcO41QeXKz2"

    invoke-static {v0}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۡ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۥ۠ۨۡ(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;)V
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

    check-cast p2, Landroid/content/Context;

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lkevin/fun/hook/download/DownloadManager;->lambda$11$kevin-fun-hook-download-DownloadManager(ZLandroid/content/Context;Ljava/lang/String;)V

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
    .locals 6

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v4, "\u06e1\u06df\u06e1"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {v2, v5, v3, v0}, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda8;->ۥ۠ۨۡ(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e1\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۣۣ۟۠ۧ(Ljava/lang/Object;)Z

    move-result v5

    const-string v1, "\u06e5\u06e1\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣۧۢ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;

    move-result-object v1

    const-string v4, "\u06e3\u06e8\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۨۨۨ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    const-string v4, "\u06e3\u06df\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣۨۨۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e6\u06e7\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aae83 -> :sswitch_2
        0x1ab605 -> :sswitch_4
        0x1ab71d -> :sswitch_1
        0x1abdc4 -> :sswitch_3
        0x1ac23f -> :sswitch_0
    .end sparse-switch
.end method
