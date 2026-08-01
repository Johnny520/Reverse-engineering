.class public final synthetic Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

.field public final f$1:Landroid/content/Context;

.field public final f$2:I

.field public final f$3:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;Landroid/content/Context;II)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda2;->f$0:Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    iput-object p2, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda2;->f$1:Landroid/content/Context;

    iput p3, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda2;->f$2:I

    iput p4, p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda2;->f$3:I

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
    const-string v0, "bX9KRH2u"

    invoke-static {v0}, Landroidx/activity/ۤۧۧۧ;->ۣۣۤ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۤ۠ۢۡ(Ljava/lang/Object;Ljava/lang/Object;II)V
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
    check-cast p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1, p2, p3}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->lambda$1$kevin-fun-hook-download-DownloadManager$BatchDownloadManager(Landroid/content/Context;II)V

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
    .locals 4

    invoke-static {p0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۢۦۥۦ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    invoke-static {p0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۤۤۦ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۡۨۥۢ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda2;->۟ۤ۠ۢۡ(Ljava/lang/Object;Ljava/lang/Object;II)V

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
    const-string v0, "6cAbLBpycrFhS8gYaCzMYQ"

    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۨ۠ۦۣ(Ljava/lang/String;)Ljava/lang/String;

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
